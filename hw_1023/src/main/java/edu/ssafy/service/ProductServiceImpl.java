package edu.ssafy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ssafy.dto.Product;
import edu.ssafy.repository.ProductRepository;


@Service("ProductServiceImpl")
public class ProductServiceImpl implements ProductService{
	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	@Autowired
	@Qualifier(value="MemberRepositoryMyBatis")
	private ProductRepository repo;
	
	
	@Override
	@Transactional()
	public void insert(String num, String name, String price) {
		// TODO Auto-generated method stub
		logger.info("ProductServiceImpl {}","insert");
		Product p =  new Product();
		p.setNumber(num);
		p.setName(name);
		p.setPrice(price);
		repo.insert(p);
		
	}

}
