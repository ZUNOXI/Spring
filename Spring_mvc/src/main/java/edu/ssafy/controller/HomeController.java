package edu.ssafy.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ssafy.dto.Member;
import edu.ssafy.dto.Product;
import edu.ssafy.service.MemService;
import edu.ssafy.service.ProdService;

@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {	
		return "home";
	}
	
	@Autowired
	@Qualifier("MemServiceImpl")
	private MemService mem;
	
	@Autowired
	@Qualifier("ProdServiceImpl")
	private ProdService prod;
	
	// 회원가입 버튼 클릭시 회면 이동
	@RequestMapping("/signupPage")
	public ModelAndView signupPage(ModelAndView mv) {
		
		mv.setViewName("/member/signup");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpSession session, HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		List<Member> list = mem.selectList();
		Member m = null;
		for(Member var : list) {
			
			if(var.getId().equals(id) && var.getPw().equals(pw)) {
				m = var;
				break;
			}
		}
		
		if(m != null) {
			session.setAttribute("login", m);
			
			List<Product> list2 = prod.selectList();
			mv.addObject("prodlist", list2);
			mv.setViewName("product/prodlist");
		}
		else {
			req.setAttribute("fail", "로그인에 실패하셨습니다.");
			mv.setViewName("error/failedpage");
		}
		
		return mv;
	}
	
	@Transactional
	@RequestMapping("/signup")
	public ModelAndView signUp(HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String addr = req.getParameter("addr");
		
		mem.insert(id, pw, name, email, addr);
		mv.setViewName("home");
		
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