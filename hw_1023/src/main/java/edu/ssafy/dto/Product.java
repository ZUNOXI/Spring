package edu.ssafy.dto;

public class Product {
	private String number;
	private String name;
	private String price;
	public Product() {}
	public Product(String number, String name, String price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
	
}
