package edu.ssafy.service;

import java.util.List;

import edu.ssafy.dto.Product;

public interface ProdService {

	public void insert(String num, String name, int price, String com);
	public void update(String num, String name, int price, String com);
	public void delete(String num);
	public Product selectNum(String num);
	public List<Product> selectList();
}
