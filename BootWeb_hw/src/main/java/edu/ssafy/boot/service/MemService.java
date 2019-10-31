package edu.ssafy.boot.service;

import java.util.List;

import edu.ssafy.boot.dto.Member;


public interface MemService {

	public void insert(String id, String pw, String name, String email, String addr);
	public void update(String id, String pw, String name, String email, String addr);
	public void delete(String id);
	public Member selectId(String id);
	public List<Member> selectList();
}
