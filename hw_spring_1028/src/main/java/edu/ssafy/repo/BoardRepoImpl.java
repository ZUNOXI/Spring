package edu.ssafy.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ssafy.dto.Board;

@Repository("BoardRepoImpl")
public class BoardRepoImpl implements IBoardRepo{

	@Autowired
	SqlSession session;
	
	@Override
	public void insert(Board b) {
		
		session.insert("board.boardinsert", b);
	}

	@Override
	public List<Board> boardlist() {
		
		return session.selectList("board.boardselect");
	}

	@Override
	public void update(Board b) {
		session.update("board.boardupdate", b);
	}

	@Override
	public void delete(String num) {
		session.delete("board.boarddelete", num);
	}
	
}
