package edu.ssafy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.ssafy.dto.Member;
import edu.ssafy.repository.MemRepo;


@Service(value="MemServiceImpl")
public class MemServiceImpl implements MemService {
	@Autowired
	@Qualifier("MemJDBCRepoImpl")
	private MemRepo repo;
	
	public MemServiceImpl() {
		
	}
	@Override
	public void insert(String id, String pw, String name, String email) {
		// TODO Auto-generated method stub
		repo.insert(new Member(id, pw, name, email));
		
	}

	@Override
	public void update(String id, String pw, String name, String email) {
		// TODO Auto-generated method stub
		repo.update(new Member(id, pw, name, email));
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

	@Override
	public Member selectOne(String id) {
		// TODO Auto-generated method stub
		
		return repo.selectOne(id);
	}

	@Override
	public List<Member> selectList() {
		// TODO Auto-generated method stub
		return repo.selectList();
	}

}
