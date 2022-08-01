package com.personalproject.truyum.dao;

import java.util.List;

import com.personalproject.truyum.model.MenuItem;

public interface MenuItemDao {
	
	public List<MenuItem> getMenuItemListAdmin();
	public List<MenuItem> getMenuItemCustomers();
	public void modifyMenuItem(MenuItem menuitem);
	public MenuItem getMenuitem(Long menuItemId);
}
