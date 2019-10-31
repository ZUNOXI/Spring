package edu.ssafy.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.ssafy.dto.Product;

@Repository("ProdRepoImpl")
public class ProdRepoImpl implements ProdRepo {

	@Autowired
	@Qualifier("SqlSession")
	private SqlSession session;
	
	@Override
	public void insert(Product p) {
		session.insert("sql.prod.prodinsert", p);
	}

	@Override
	public void update(Product p) {
		session.update("sql.prod.produpdate", p);
	}

	@Override
	public void delete(String p) {
		session.delete("sql.prod.proddelete", p);
	}

	@Override
	public Product selectnum(String num) {
		return session.selectOne("sql.prod.prodselect", num);
	}

	@Override
	public List<Product> selectlist() {
		return session.selectList("sql.prod.prodlist");
	}

}
