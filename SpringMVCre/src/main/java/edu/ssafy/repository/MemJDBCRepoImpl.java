package edu.ssafy.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ssafy.dto.Member;

@Repository(value="MemJDBCRepoImpl")
public class MemJDBCRepoImpl implements MemRepo{
	@Autowired
	private DataSource ds;
	
	public MemJDBCRepoImpl() {
		
	}
	@Override
	public void insert(Member m) {
        System.out.println("insert");
        Connection conn=null;
        PreparedStatement pstmt = null;
        try {
            conn=ds.getConnection();
            pstmt = conn.prepareStatement("insert into members(id,pw,name,email) values(?,?,?,?)");
            pstmt.setString(1, m.getId());
            pstmt.setString(2, m.getPw());
            pstmt.setString(3, m.getName());
            pstmt.setString(4, m.getEmail());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
    }

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		System.out.println("update");
		Connection conn=null;
        PreparedStatement pstmt = null;
        try {
            conn=ds.getConnection();
            pstmt = conn.prepareStatement("update springweb set pw=?, name=?, email=? where id=?");
            pstmt.setString(1, m.getPw());
            pstmt.setString(2, m.getName());
            pstmt.setString(3, m.getEmail());
            pstmt.setString(4, m.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		System.out.println("delete");
		Connection conn=null;
        PreparedStatement pstmt = null;
        try {
            conn=ds.getConnection();
            pstmt = conn.prepareStatement("delete from springweb where id=?");
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}
	
	@Override
	public Member selectOne(String id) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Member m = new Member();
		try {
			con = ds.getConnection();
			st = con.prepareStatement("select * from members where id = ?");
			st.setString(1, id);
			rs = st.executeQuery();
			if(rs.next()) {
				m.setId(rs.getString(1));
				m.setPw(rs.getString(2));
				m.setName(rs.getString(3));
				m.setEmail(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("selectOne");
		return m;
		}
	
	@Override
	public ArrayList<Member> selectList() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>();
		try {
			con = ds.getConnection();
			st = con.prepareStatement("select * from members");
			rs = st.executeQuery();
			while(rs.next()) {
				Member m = new Member();
				m.setId(rs.getString(1));
				m.setPw(rs.getString(2));
				m.setName(rs.getString(3));
				m.setEmail(rs.getString(4));
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("selectList");
		return list;
	}
}
