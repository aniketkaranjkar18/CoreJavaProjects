package com.cts.springboot.truyum.model;

import java.util.Date;

public class MenuItem {
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private long id;
	private String name;
	private int price;
	private String active;
	private Date dateOfLaunch;
	private String category;
	private String freeDelivery;
	private String url;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFreeDelivery() {
		return freeDelivery;
	}
	public void setFreeDelivery(String freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	public MenuItem(long id, String name, int price, String active, Date dateOfLaunch, String category,
			String freeDelivery, String url) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
		this.url = url;
	}
	public MenuItem() {
		super();
	}
	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", price=" + price + ", active=" + active + ", dateOfLaunch="
				+ dateOfLaunch + ", category=" + category + ", freeDelivery=" + freeDelivery + ", url=" + url + "]";
	}
	
}
