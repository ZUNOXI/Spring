package edu.ssafy.dto;

public class Board {

	private String num;
	private String title;
	private String content;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Board() {}
	public Board(String num, String title, String content) {
		this.num = num;
		this.title = title;
		this.content = content;
	}
}
