package ssafy.model.service;

import java.util.List;

import ssafy.model.dto.Product;
import ssafy.model.repository.ProductRepo;

public interface ProductService {
	public ProductRepo getRepo();
	public List<Product> selectAll();
	public Product select(String id);
	public int insert(Product product);
	public int update(Product product);
	public int delete(String id);

	
}
