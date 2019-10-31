package edu.ssafy.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ssafy.dto.Member;
import edu.ssafy.dto.Product;
import edu.ssafy.service.MemService;
import edu.ssafy.service.ProductService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Autowired
	@Qualifier("MemServiceImpl")
	private MemService mem;
	
	@Autowired
	@Qualifier("ProductServiceImpl")
	private ProductService prod;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpSession session,HttpServletRequest req,ModelAndView mv) {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		System.out.println("???");
		List<Member>listm = mem.Selectlist();
		Member m = null;
		
		for(int i = 0; i<listm.size(); i++) {
			if(listm.get(i).getId().equals(id) && listm.get(i).getPw().equals(pw)) {
				m = listm.get(i);
			}
		}
		
		if(m!=null) {
			System.out.println("m이 널이 아니다");
			session.setAttribute("login", m);
			List<Product>listp = prod.Selectlist();
			mv.addObject("prodlist", listp);
			System.out.println("????");
			mv.setViewName("product/prodlist");
			
		}
		else {
			req.setAttribute("fail", "로그인 실패");
			mv.setViewName("home");
		}
		return mv;
	}
	
	@RequestMapping("/signupPage")
	public ModelAndView signupPage(ModelAndView mv) {
		System.out.println("등록하려구요");
		mv.setViewName("/member/signup");
		return mv;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signUp(HttpServletRequest req, ModelAndView mv) {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		mem.insert(id, pw, name, email);
		mv.setViewName("redirect:/");
		
		return mv;
	}
}
