package edu.ssafy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ssafy.dto.Product;
import edu.ssafy.service.ProdService;

@Controller
public class ProdController {
	
	public ProdController() {}
	
	@Autowired
	@Qualifier("ProdServiceImpl")
	private ProdService prod;
	
	@RequestMapping("/prodlistpage")
	public ModelAndView prodlistPage(ModelAndView mv) {
		
		List<Product> list = prod.selectList();
		
		mv.addObject("prodlist", list);
		mv.setViewName("product/prodlist");
		
		return mv;
	}
	
	@RequestMapping("detailprod")
	public ModelAndView detailProd(HttpServletRequest req, ModelAndView mv) {
		
		String num = req.getParameter("num");
		Product p = prod.selectNum(num);
		mv.addObject("product", p);
		
		mv.setViewName("product/detailprod");
		
		return mv;
	}
	
	@Transactional
	@RequestMapping("prodinsertpage")
	public ModelAndView prodinsertPage(ModelAndView mv) {
		
		mv.setViewName("product/prodinsert");
		
		return mv;
	}
	
	@Transactional
	@RequestMapping("prodinsert")
	public ModelAndView prodInsert(HttpServletRequest req, ModelAndView mv) {
		
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		String com = req.getParameter("com");
		
		prod.insert(num, name, price, com);
		List<Product> list = prod.selectList();
		mv.addObject("prodlist", list);
		mv.setViewName("product/prodlist");
		
		return mv;
	}
	
	@RequestMapping("deleteprod")
	public ModelAndView prodDelete(HttpServletRequest req, ModelAndView mv) {
		
		String num = req.getParameter("num");
		
		prod.delete(num);
		
		List<Product> list = prod.selectList();
		
		mv.addObject("prodlist", list);
		mv.setViewName("product/prodlist");
		
		return mv;
	}
	
	@RequestMapping("updateprod")
	public ModelAndView produpdatepage(HttpServletRequest req, ModelAndView mv) {
		
		String num = (String)req.getParameter("num");
		
		mv.addObject("prodnum", num);
		mv.setViewName("product/updatepage");
		
		return mv;
	}
	
	@RequestMapping("produpdate")
	public ModelAndView prodUpdate(HttpServletRequest req, ModelAndView mv) {
		
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		String com = req.getParameter("com");
		
		System.out.println(num + " " + name + " " + price + " " + com);
		
		prod.update(num, name, price, com);
		List<Product> list = prod.selectList();
		
		mv.addObject("prodlist", list);
		mv.setViewName("product/prodlist");
		
		return mv;
	}
}
