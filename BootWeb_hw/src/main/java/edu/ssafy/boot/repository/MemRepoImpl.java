package edu.ssafy.boot.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.ssafy.boot.dto.Member;

@Repository("MemRepoImpl")
public class MemRepoImpl implements MemRepo {

	@Autowired
	//@Qualifier("SqlSession")
	private SqlSession session;
	
	@Override
	public void insert(Member m) {
		
		session.insert("sql.mem.meminsert", m);
	}

	@Override
	public void update(Member m) {

		session.update("sql.mem.memupdate", m);
	}

	@Override
	public void delete(String id) {

		session.delete("sql.mem.memdelete", id);
	}

	@Override
	public Member selectId(String id) {

//		return null;
		return session.selectOne("sql.mem.memselect", id);
	}

	@Override
	public List<Member> selectList() {
		
//		return null;
		return session.selectList("sql.mem.memlist");
	}
}
