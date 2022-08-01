package com.personalproject.truyum.model;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
	private long id;
	private String name;
	private float price;
	private boolean active;
	private Date dateOflaunch;
	private String category;
	private boolean freeDelivery;
	
	public MenuItem(long id, String name, float price, boolean active, Date dateOflaunch, String category,
			boolean freeDelivery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateOflaunch = dateOflaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}

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

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateOflaunch() {
		return dateOflaunch;
	}

	public void setDateOflaunch(Date dateOflaunch) {
		this.dateOflaunch = dateOflaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", price=" + price + ", active=" + active + ", dateOflaunch="
				+ dateOflaunch + ", category=" + category + ", freeDelivery=" + freeDelivery + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem other = (MenuItem) obj;
		return id == other.id;
	}
	
}
