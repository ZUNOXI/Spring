package ssafy.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ssafy.model.dto.Product;
import ssafy.model.repository.ProductRepo;
@Component("test")
public class ProductRepoImpl implements ProductRepo {
	static PreparedStatement pt;
	private Connection conn;
	private PreparedStatement st;
	private ResultSet rs;

	@Override
	public List<Product> selectAll() {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<Product>();
		String sql = "select * from product";
		try {
			conn = ConnectionProxy.getConnection();
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getString("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				p.setDescription(rs.getString("des"));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	@Override
	public Product select(String id) {
		// TODO Auto-generated method stub
		Product p = new Product();
		String sql = "select * from product where id = ?";
		try {
			conn = ConnectionProxy.getConnection();
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			rs = pt.executeQuery();
			while (rs.next()) {
//				Product p =new Product();
				p.setId(rs.getString("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				p.setDescription(rs.getString("des"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return p;
	}

	@Override
	public int insert(Product product) {
		// TODO Auto-generated method stub

		String str = "insert into product(id,name,price,des)values(?,?,?,?)";
		int a = 0;
		try {
			conn = ConnectionProxy.getConnection();
			
			pt = conn.prepareStatement(str);
			pt.setString(1, product.getId());
			pt.setString(2, product.getName());
			pt.setInt(3, product.getPrice());
			pt.setString(4, product.getDescription());
			
			a = pt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return a;
	}

	@Override
	public int update(Product product) {
		// TODO Auto-generated method stub
		String str = "update product set name = ?, price = ?, des = ? where id = ?";
		int a = 0;
		try {
			conn = ConnectionProxy.getConnection();
			
			pt = conn.prepareStatement(str);
			pt.setString(4, product.getId());
			pt.setString(1, product.getName());
			pt.setInt(2, product.getPrice());
			pt.setString(3, product.getDescription());
			
			a = pt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return a;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from product where id = ?";
		int a = 0;		
		try {
			conn = ConnectionProxy.getConnection();
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			a = pt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return a;
	}

	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
