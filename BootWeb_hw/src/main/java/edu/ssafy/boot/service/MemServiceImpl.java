package edu.ssafy.boot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.ssafy.boot.dto.Member;
import edu.ssafy.boot.repository.MemRepo;

@Service("MemServiceImpl")
public class MemServiceImpl implements MemService {

	@Autowired
	@Qualifier("MemRepoImpl")
	private MemRepo repo;
	public MemServiceImpl() {}
	
	@Override
	public void insert(String id, String pw, String name, String email, String addr) {

		repo.insert(new Member(id, pw, name, email, addr));
	}

	@Override
	public void update(String id, String pw, String name, String email, String addr) {
		
		repo.update(new Member(id, pw, name, email, addr));
	}

	@Override
	public void delete(String id) {

		repo.delete(id);
	}

	@Override
	public Member selectId(String id) {
		
		return repo.selectId(id);
	}

	@Override
	public List<Member> selectList() {

		return repo.selectList();
	}

}
