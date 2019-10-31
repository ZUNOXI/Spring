package edu.ssafy.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.ssafy.dto.Product;

@Repository("ProductRepoImpl")
public class ProductRepoImpl implements ProductRepo{
	
	@Autowired
	@Qualifier("SqlSession")
	private SqlSession session;
	
	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		session.insert("sql.prod.prodinsert", p);
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product Selected(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> SelectList() {
		// TODO Auto-generated method stub
		System.out.println("제품내역검사중");
		return session.selectList("sql.prod.prodlist");
	}

}
