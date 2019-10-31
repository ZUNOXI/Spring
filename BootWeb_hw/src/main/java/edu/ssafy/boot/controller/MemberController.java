package edu.ssafy.boot.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ssafy.boot.dto.Member;
import edu.ssafy.boot.service.MemService;


@Controller

public class MemberController {
	
	//@RequestMapping(value= "/", method=RequestMethod.GET)
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
	@Autowired
	@Qualifier("MemServiceImpl")
	private MemService mem;
	
	@RequestMapping("/signupPage")
	public ModelAndView signupPage(ModelAndView mv) {
		
		mv.setViewName("/member/signup");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpSession session, HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		System.out.println(id+" "+pw);
		List<Member> list = mem.selectList();
		System.out.println("여기서 오류가..?");
		Member m = null;
		for(Member var : list) {
			
			if(var.getId().equals(id) && var.getPw().equals(pw)) {
				m = var;
				break;
			}
		}
		
		if(m != null) {
			System.out.println("m비었다");
			session.setAttribute("login", m);
			mv.addObject("memlist", list);
			mv.setViewName("member/memlistpage");
		}
		else {
			req.setAttribute("fail", "로그인에 실패하셨습니다.");
		}
		
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView signUp(HttpServletRequest req, ModelAndView mv) {
		try { // exceotion 처리
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String addr = req.getParameter("addr");
		
		mem.insert(id, pw, name, email,addr);
		mv.setViewName("home");
		}catch (Exception e) {
			mv.setViewName("error");
		}
		return mv;
	}
	
	@RequestMapping("updatemem")
	public ModelAndView memupdatepage(HttpServletRequest req, ModelAndView mv) {
		
		String id = (String)req.getParameter("id");
		
		mv.addObject("memid", id);
		mv.setViewName("updatepage");
		
		return mv;
	}
	
	@RequestMapping("memupdate")
	public ModelAndView prodUpdate(HttpServletRequest req, ModelAndView mv) {
		
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String addr = req.getParameter("addr");
		
		System.out.println(id+" "+pw+" "+name+" "+email+" "+addr);
		mem.update(id, pw, name, email, addr);
		
		List<Member>list=mem.selectList();
		
		mv.addObject("memlist", list);
		mv.setViewName("member/memlistpage");
		
		return mv;
	}
	
	@RequestMapping("/memberpage")
	public ModelAndView memberpage(HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("id");
		
		Member m = mem.selectId(id);
		
		mv.addObject("member", m);
		mv.setViewName("/member/memberpage");
		
		return mv;
	}
	
	@RequestMapping("/memlistpage")
	public ModelAndView memlistpage(HttpServletRequest req, ModelAndView mv) {
		
		List<Member> list = mem.selectList();
		
		mv.addObject("memlist", list);
		mv.setViewName("member/memlistpage");
		return mv;
	}
	
	@RequestMapping("deletemem")
	public ModelAndView deleteMem(HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("id");
		
		mem.delete(id);
		List<Member> list = mem.selectList();
		
		mv.addObject("memlist", list);
		mv.setViewName("member/memlistpage");
		
		return mv;
	}
}
