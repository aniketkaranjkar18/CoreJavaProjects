package com.personalproject.truyum;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.personalproject.truyum.dao.CartDao;
import com.personalproject.truyum.dao.CartDaoCollectionImpl;
import com.personalproject.truyum.dao.CartEmptyException;
import com.personalproject.truyum.dao.MenuItemDao;
import com.personalproject.truyum.dao.MenuItemDaoCollectionImpl;
import com.personalproject.truyum.model.MenuItem;
import com.personalproject.truyum.util.DateUtil;

@SpringBootApplication
public class TruyumApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruyumApplication.class, args);
		
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
		testGetMenuItem();
		testAddCartItem();
		testRemoveFromCart();

	}

	public static void testGetMenuItemListAdmin() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		for(MenuItem item:menuItemDao.getMenuItemListAdmin()){
			System.out.println(item);
		}
		
	}

	public static void testGetMenuItemListCustomer() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		for(MenuItem item:menuItemDao.getMenuItemCustomers()){
			System.out.println(item);
		}
	}
	
	public static void testModifyMenuItem() {
		MenuItem modifiedMenuItem = new MenuItem(3, "Cold Drink", 98, false, DateUtil.convertToDate("14/03/2022"), "Soft Drinks", false);
		MenuItemDao mid = new  MenuItemDaoCollectionImpl();
		mid.modifyMenuItem(modifiedMenuItem);
	}
	
	public static void testGetMenuItem() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		System.out.println(menuItemDao.getMenuitem(3l));
	}
	
	public static void testAddCartItem() {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1l, 3l);
		cartDao.addCartItem(1l, 2l);
		cartDao.addCartItem(1l, 1l);

		try {
			System.out.println(cartDao.getAllCartItems(1l));
		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void testRemoveFromCart() {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.removeCartItem(1l, 2l);	
		try {
			System.out.println(cartDao.getAllCartItems(1l));
		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
	}

	}


