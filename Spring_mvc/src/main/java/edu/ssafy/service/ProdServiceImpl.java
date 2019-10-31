package edu.ssafy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.ssafy.dto.Product;
import edu.ssafy.repository.ProdRepo;

@Service("ProdServiceImpl")
public class ProdServiceImpl implements ProdService {

	@Autowired
	@Qualifier("ProdRepoImpl")
	private ProdRepo repo;
	public ProdServiceImpl() {}
	
	@Override
	public void insert(String num, String name, int price, String com) {

		repo.insert(new Product(num, name, price, com));
	}

	@Override
	public void update(String num, String name, int price, String com) {

		repo.update(new Product(num, name, price, com));
	}

	@Override
	public void delete(String num) {
		
		repo.delete(num);
	}

	@Override
	public Product selectNum(String num) {

		return repo.selectnum(num);
	}

	@Override
	public List<Product> selectList() {

		return repo.selectlist();
	}

}
