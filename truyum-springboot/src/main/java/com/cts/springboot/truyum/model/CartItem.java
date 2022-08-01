package com.cts.springboot.truyum.model;

public class CartItem {
	@Override
	public String toString() {
		return "CartItem [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	public CartItem(String name, int id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public CartItem() {
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
	String name;
	int id;
	private int price;
}
