package ssafy.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ssafy.model.dto.Config;
import ssafy.model.dto.Product;
import ssafy.model.service.ProductService;

public class BeanTest {
	public static void main(String[] args) {

		BeanFactory fac = new AnnotationConfigApplicationContext(Config.class);
		ProductService product = (ProductService) fac.getBean("service");
		
		product.insert(new Product("3","3",3,"3"));
		System.out.println(product.selectAll().toString());
		product.delete("3");
		System.out.println(product.selectAll().toString());

	}
}
