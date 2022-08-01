package com.cts.springboot.truyum.dao;

import java.util.List;

import com.cts.springboot.truyum.model.MenuItem;

public interface MenuItemDao {
	List<MenuItem> getMenuItemAdmin();
	void editMenu(int itemId,String name,int price);
}
