package edu.ssafy.dto;

public class Product {

	private String num;
	private String name;
	private int price;
	private String com;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	
	public Product() {}
	public Product(String num, String name, int price, String com) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.com = com;
	}
	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + ", com=" + com + "]";
	}
}
