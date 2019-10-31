package edu.ssafy.repo;

import java.util.List;

import edu.ssafy.dto.Board;

public interface IBoardRepo {

	public void insert(Board b);
	public List<Board> boardlist();
	public void update(Board b);
	public void delete(String num);
}
