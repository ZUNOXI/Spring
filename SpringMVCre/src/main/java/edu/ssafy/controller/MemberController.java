package edu.ssafy.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ssafy.dto.Member;
import edu.ssafy.service.MemService;

@Controller
public class MemberController {
	@Autowired
	@Qualifier("MemServiceImpl")
	MemService ser;
	
	ArrayList<Member> list = new ArrayList<Member>();
	@RequestMapping("/memregpage")
	public ModelAndView insertPage(ModelAndView mv) {
		mv.setViewName("member/memreg");
//		mv.setViewName("redirect:/member/memreg");
		return mv;
	}
	
	@RequestMapping("/meminsert")
	public ModelAndView insert(HttpServletRequest req, ModelAndView mv) {
		// 입력처리
		System.out.println("들어왔다");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		// 로직처리
		ser.insert(id, pw, name, email);
		
		// 결과처리
		list.add(new Member(id,null,name,email));
		mv.addObject("list", list);
		mv.setViewName("member/memlist");
		
//		System.out.println("member insert");
//		mv.addObject("res","member insert");
//		mv.setViewName("test");
		
		return mv;
	}
	@RequestMapping("/memupdate")
	public ModelAndView update(HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		ser.update(id, pw, name, email);
		int k = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				k = i;
				break;
			}
		}
		list.set(k, new Member(id, pw, name, email));
		
		mv.addObject("list", list);
		mv.setViewName("member/memlist");
		return mv;
	}
	@RequestMapping("/memdelete")
	public ModelAndView delete(HttpServletRequest req, ModelAndView mv) {

		String id = req.getParameter("id");
		ser.delete(id);
		int k = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				k = i;
				break;
			}
		}
		list.remove(k);
		
		mv.addObject("list", list);
		mv.setViewName("member/memlist");
		
		
		return mv;
	}
	@RequestMapping("/memselone")
	public ModelAndView selectOne(HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("uid");
		ser.selectOne(id);
		Member res = null;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				res = list.get(i);
				break;
			}
		}
		
		mv.addObject("res", res);
		mv.setViewName("member/memmain");
		return mv;
	}
	@RequestMapping("/memselall")
	public ModelAndView selectAll(HttpServletRequest req, ModelAndView mv) {
		
		ser.selectList();
		mv.addObject("list", list);
		mv.setViewName("member/memlist");
		return mv;
	}
}
