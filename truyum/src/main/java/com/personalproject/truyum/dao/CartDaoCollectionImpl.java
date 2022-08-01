package com.personalproject.truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.personalproject.truyum.model.Cart;
import com.personalproject.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao{

	private static HashMap<Long,Cart> userCarts;
	
	public CartDaoCollectionImpl() {
		if(userCarts==null) {
			userCarts = new HashMap<Long,Cart>();		
		}
		
	}

	@Override
	public void addCartItem(long userId, long menuItemId) {
		MenuItemDao mID = new MenuItemDaoCollectionImpl();
		if(userCarts.containsKey(userId)) {
			List<MenuItem> menuItem = userCarts.get(userId).getMenuItemList();
			menuItem.add(mID.getMenuitem(menuItemId));
		}
		if(!userCarts.containsKey(userId)) {
			ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
			Cart cart =  new Cart(menuItemList, 0);
			menuItemList.add(mID.getMenuitem(menuItemId));
			cart.setMenuItemList(menuItemList);
			userCarts.put(userId, cart);
		}
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		List<MenuItem> userMenuItemList = userCarts.get(userId).getMenuItemList();
		if(userMenuItemList==null) {
			throw new CartEmptyException();
		}
		if(userMenuItemList!=null) {
			float total = 0 ;
			for(MenuItem menu : userMenuItemList) {	
				total=total+menu.getPrice();
			}
			userCarts.get(userId).setTotal(total);
		}
		return userMenuItemList;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		List<MenuItem> menuItemList = new ArrayList<MenuItem>();
		menuItemList=userCarts.get(userId).getMenuItemList();
		double total = userCarts.get(userId).getTotal();
		if(userCarts.containsKey(userId)) {
			for(MenuItem menu : menuItemList) {
				if(menu.getId()==menuItemId) {
					menuItemList.remove(menu);
					total=total-menu.getPrice();
				}
				userCarts.get(userId).setMenuItemList(menuItemList);
				userCarts.get(userId).setTotal(total);
			}
		}
	}

	
}
