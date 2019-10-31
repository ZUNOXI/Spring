package ssafy.model.repository;

import java.util.List;
import ssafy.model.dto.Product;
import ssafy.model.repository.ProductRepo;

public interface ProductRepo {
	public List<Product> selectAll();
	public Product select(String id);
	public int insert(Product product);
	public int update(Product product);
	public int delete(String id);
	
}
