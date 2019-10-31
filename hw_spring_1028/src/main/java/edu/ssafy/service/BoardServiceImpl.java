package edu.ssafy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.ssafy.dto.Board;
import edu.ssafy.repo.IBoardRepo;

@Service("BoardServiceImpl")
public class BoardServiceImpl implements IBoardService {

	@Autowired
	@Qualifier("BoardRepoImpl")
	private IBoardRepo repo;
	
	@Override
	public void insert(String num, String title, String content) {
		repo.insert(new Board(num, title, content));
	}

	@Override
	public List<Board> boardlist() {
		return repo.boardlist();
	}

	@Override
	public void update(String num, String title, String content) {
		repo.update(new Board(num, title, content));
	}

	@Override
	public void delete(String num) {
		repo.delete(num);
	}

	
}
