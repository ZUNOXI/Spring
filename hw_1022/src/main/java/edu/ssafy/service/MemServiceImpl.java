package edu.ssafy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.ssafy.dto.Member;
import edu.ssafy.repository.MemRepo;

@Service("MemServiceImpl")
public class MemServiceImpl implements MemService {
	
	@Autowired
	@Qualifier("MemRepoImpl")
	private MemRepo repo;
	
	public MemServiceImpl() {}
	
	
	@Override
	public void insert(String id, String pw, String name, String email) {
		System.out.println("멤버추가!");
		repo.insert(new Member(id, pw, name, email));
	}

	@Override
	public void update(String id, String pw, String name, String email) {
		
		repo.update(new Member(id, pw, name, email));
	}

	@Override
	public void delete(String id) {
		repo.delete(id);
	}

	@Override
	public Member selected(String id) {
		// TODO Auto-generated method stub
		return repo.Selected(id);
	}

	@Override
	public List<Member> Selectlist() {
		// TODO Auto-generated method stub
		System.out.println("명단확인합시다");
		return repo.SelectList();
	}

}
