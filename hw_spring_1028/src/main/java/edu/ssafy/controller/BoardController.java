package edu.ssafy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ssafy.dto.Board;
import edu.ssafy.service.IBoardService;
import io.swagger.annotations.ApiOperation;

@Controller
public class BoardController {

	@Autowired
	IBoardService ser;
	
	@RequestMapping(value="/")
	public String index(Model m){
		m.addAttribute("message", "메인 페이지입니다");
		
		return "index";
	}
	
	@ApiOperation(value="게시판에 보드를 입력합니다.")
	@RequestMapping(value="/restboard", method=RequestMethod.POST)
	public void boardinsert(@RequestBody Board b) {
		ser.insert(b.getNum(), b.getTitle(), b.getContent());
	}
	
	@ApiOperation(value="게시판을 조회합니다.")
	@RequestMapping(value="/restboard", method=RequestMethod.GET)
	public @ResponseBody List<Board> boardlist(){
		return ser.boardlist();
	}
	
	@ApiOperation(value="게시판에 보드를 수정합니다.")
	@RequestMapping(value="/restboard", method=RequestMethod.PUT)
	public void boardupdate(@RequestBody Board b) {
		ser.update(b.getNum(), b.getTitle(), b.getContent());
	}
	
	@ApiOperation(value="게시판에 보드를 삭제합니다.")
	@RequestMapping(value="/restboard/{num}", method=RequestMethod.DELETE)
	public void boarddelete(@PathVariable String num) {
		ser.delete(num);
	}
}