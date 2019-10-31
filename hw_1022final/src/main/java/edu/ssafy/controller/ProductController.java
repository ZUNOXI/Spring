package edu.ssafy.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ssafy.service.ProductService;

@Controller
@RequestMapping("/Product")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService ser;
	
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest req, ModelAndView m) {
		logger.info("ProductController", "insert");
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		
		ser.insert(num, name, price);
		m.addObject("msg", "쉬었다가 해요");
		m.setViewName("result");
		return m;
	}
}
