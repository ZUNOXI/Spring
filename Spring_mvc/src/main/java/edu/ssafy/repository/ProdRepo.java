package edu.ssafy.repository;

import java.util.List;

import edu.ssafy.dto.Product;

public interface ProdRepo {

	public void insert(Product p);
	public void update(Product p);
	public void delete(String p);
	public Product selectnum(String num);
	public List<Product> selectlist();
}
