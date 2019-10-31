package edu.ssafy.service;

import java.util.List;

import edu.ssafy.dto.Product;

public interface ProductService {
	public void insert(String num,String name,int price);
	public void update(String num,String name,int price);
	public void delete(String num);
	public Product selected(String id);
	public List<Product>Selectlist();
}
