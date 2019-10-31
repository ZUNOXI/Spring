package edu.ssafy.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ssafy.dto.Product;

@Repository("ProductRepositoryMyBatis")
public class ProductRepositoryMyBatis implements ProductRepository {
	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		System.out.println(p.toString());
		session.insert("pro.insert",p);	
	}

}
