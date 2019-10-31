package edu.ssafy.service;

import java.util.List;

import edu.ssafy.dto.Member;

public interface MemService {
	public void insert(String id,String pw,String name,String email);
	public void update(String id,String pw,String name,String email);
	public void delete(String id);
	public Member selected(String id);
	public List<Member>Selectlist();
}
