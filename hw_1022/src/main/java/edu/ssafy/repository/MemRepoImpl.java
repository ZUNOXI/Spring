package edu.ssafy.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.ssafy.dto.Member;

@Repository("MemRepoImpl")
public class MemRepoImpl implements MemRepo{
	
	@Autowired
	@Qualifier("SqlSession")
	private SqlSession session;
	
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		session.insert("sql.mem.meminsert", m);
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member Selected(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> SelectList() {
		// TODO Auto-generated method stub
		return session.selectList("sql.mem.memlist");
	}

}
