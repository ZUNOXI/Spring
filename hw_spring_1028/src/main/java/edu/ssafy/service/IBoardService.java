package edu.ssafy.service;

import java.util.List;

import edu.ssafy.dto.Board;

public interface IBoardService {

	public void insert(String num, String title, String content);
	public List<Board> boardlist();
	public void update(String num, String title, String content);
	public void delete(String num);
}
