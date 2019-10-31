package edu.ssafy.repository;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.ssafy.dto.Member;

@Repository("MemMybatisRepoImpl")
public class MemMybatisRepoImpl implements MemRepo{
	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		session.insert("sql.member.insertMember",m);
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
	public Member selectOne(String id) {
		// TODO Auto-generated method stub
		Member m = session.selectOne("member.selectMember", id);
		return null;
	}

	@Override
	public ArrayList<Member> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

}
