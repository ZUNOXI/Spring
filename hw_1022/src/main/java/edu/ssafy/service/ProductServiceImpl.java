package edu.ssafy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.ssafy.dto.Product;
import edu.ssafy.repository.ProductRepo;

@Service("ProductServiceImpl")
public class ProductServiceImpl implements ProductService{

	@Autowired
	@Qualifier("ProductRepoImpl")
	private ProductRepo repo;
	public ProductServiceImpl() {}
	
	@Override
	public void insert(String num, String name, int price) {
		// TODO Auto-generated method stub
		repo.insert(new Product(num, name, price));
	}

	@Override
	public void update(String num, String name, int price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product selected(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> Selectlist() {
		// TODO Auto-generated method stub
		System.out.println("제품명단확인");
		return repo.SelectList();
	}
	
}
