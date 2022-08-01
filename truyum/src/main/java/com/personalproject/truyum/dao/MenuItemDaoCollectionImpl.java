package com.personalproject.truyum.dao;

import java.util.ArrayList;
import java.util.List;

import com.personalproject.truyum.model.MenuItem;
import com.personalproject.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private static List<MenuItem> menuItemList;

	public MenuItemDaoCollectionImpl() {
		if(menuItemList==null) {
			ArrayList<MenuItem> newMenuItemList= new ArrayList<>() ;
			
			MenuItem sandwich = new MenuItem(1,"Sandwich",99,true,DateUtil.convertToDate("12/03/2017"),"Main Course",true);
			MenuItem burger = new MenuItem(2,"Burger",99,false,DateUtil.convertToDate("11/03/2017"),"Main Course",false);
			MenuItem pizza = new MenuItem(3,"Pizza",99,true,DateUtil.convertToDate("14/03/2017"),"Main Course",true);
			MenuItem frenchFries = new MenuItem(4,"FrenchFries",99,false,DateUtil.convertToDate("4/03/2017"),"Main Course",true);
			MenuItem chocolateBrownie = new MenuItem(5,"ChocolateBrownie",99,true,DateUtil.convertToDate("19/03/2017"),"Main Course",false);		
			
			newMenuItemList.add(sandwich);
			newMenuItemList.add(burger);
			newMenuItemList.add(pizza);
			newMenuItemList.add(frenchFries);
			newMenuItemList.add(chocolateBrownie);
			
			menuItemList=newMenuItemList; 
			
		}
		
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemCustomers() {
		ArrayList<MenuItem> menuItemListCustomer =  new ArrayList<>();
		for(MenuItem menu:menuItemList) {
			if(menu.isActive()) {
				menuItemListCustomer.add(menu);
			}
		}
		return menuItemListCustomer;
	}

	@Override
	public void modifyMenuItem(MenuItem menuitem) {	
		for(MenuItem mi:menuItemList) {
			if(menuitem.getId()==mi.getId()) {
				mi.setId(menuitem.getId());
				mi.setName(menuitem.getName());
				mi.setActive(menuitem.isActive());
				mi.setCategory(menuitem.getCategory());
				mi.setDateOflaunch(menuitem.getDateOflaunch());
				mi.setFreeDelivery(menuitem.isFreeDelivery());
				mi.setPrice(menuitem.getPrice());
			}
		}
	}
	
	@Override
	public MenuItem getMenuitem(Long menuItemId) {
		MenuItem mi = null;
		for(MenuItem menu:menuItemList) {
			if(menu.getId()==menuItemId) {
				mi=  menu;
				break;
			}
		}
		return mi;
	}

	

}
