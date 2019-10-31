package edu.ssafy.boot.repository;

import java.util.List;

import edu.ssafy.boot.dto.Member;


public interface MemRepo {

	public void insert(Member m);
	public void update(Member m);
	public void delete(String id);
	public Member selectId(String id);
	public List<Member> selectList();
}
