package com.example.model;

public class Product {
	private int id;
	private String name;
	private String descrition;
	private String company;
	private int price;
	public Product(int id, String name, String descrition, String company, int price) {
		super();
		this.id = id;
		this.name = name;
		this.descrition = descrition;
		this.company = company;
		this.price = price;
	}
	public Product() {
		
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", descrition=" + descrition + ", company=" + company
				+ ", price=" + price + "]";
	}
	
	

}
