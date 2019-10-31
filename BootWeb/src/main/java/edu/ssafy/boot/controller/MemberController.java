package edu.ssafy.boot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ssafy.boot.dto.Member;
import edu.ssafy.boot.service.MemService;

@Controller
public class MemberController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@Autowired
	@Qualifier("MemServiceImpl")
	private MemService ser;

	@RequestMapping("/memregpage")
	public ModelAndView insertPage(ModelAndView mv) {
		mv.setViewName("member/memreg");
		return mv;
	}

	@RequestMapping(value = "/meminsert")
	public ModelAndView insert(HttpServletRequest req, ModelAndView mv, HttpSession ss, String id) {
		
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		ser.insert(id, pw, name, email);
	
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping(value = "/memdelete")
	public ModelAndView delete(HttpServletRequest req, ModelAndView mv) {
		String id = req.getParameter("id");
		ser.delete(id);
		mv.setViewName("redirect:memselectlist");

		return mv;
	}

	@RequestMapping(value = "/memupdate")
	public ModelAndView update(HttpServletRequest req, ModelAndView mv) {
		
		String id = (String) req.getSession().getAttribute("memid");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");

		System.out.println(id + " " + pw + " " + name + " " + email);
		ser.update(id, pw, name, email);
		mv.setViewName("redirect:memselectlist");

		return mv;
	}

	@RequestMapping(value = "memselectone")
	public ModelAndView selectOne(HttpServletRequest req, ModelAndView mv) {
		String id = req.getParameter("id");

		Member selectOne = ser.selectOne(id);

		mv.addObject("mem", selectOne);
		mv.setViewName("member/memview");
		return mv;
	}

	@RequestMapping(value = "/memselectlist")
	public ModelAndView selectList(HttpServletRequest req, ModelAndView mv) {
		List<Member> list = ser.selectList();

		mv.addObject("list", list);
		mv.setViewName("member/memlist");
		return mv;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpSession session, HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		Member m = ser.selectOne(id);
		
		if(id.equals(m.getId()) && pw.equals(m.getPw())) {
			session.setAttribute("memid", id);
			mv.setViewName("index");
		}
		
		return mv;
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpSession session, ModelAndView mv) {
		
		if(session != null)
			session.invalidate();
		
		mv.setViewName("index");
		return mv;
	}
}