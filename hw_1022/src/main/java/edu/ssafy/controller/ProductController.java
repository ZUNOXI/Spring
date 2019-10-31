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
import edu.ssafy.service.ProductService;

@Controller
public class ProductController {

	public ProductController() {}
	
	@Autowired
	@Qualifier("ProductServiceImpl")
	private ProductService prod;
	
	@RequestMapping("prodinsertpage")
	public ModelAndView prodinsertPage(ModelAndView mv) {
		
		mv.setViewName("product/prodinsert");
		
		return mv;
	}
	
	@RequestMapping("prodinsert")
	public ModelAndView prodInsert(HttpServletRequest req, ModelAndView mv) {
		
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		
		prod.insert(num, name, price);
		List<Product> list = prod.Selectlist();
		mv.addObject("prodlist", list);
		mv.setViewName("product/prodlist");
		
		return mv;
	}
}
