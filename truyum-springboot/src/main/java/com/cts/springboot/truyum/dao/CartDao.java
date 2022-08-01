package com.cts.springboot.truyum.dao;

import java.util.List;

import com.cts.springboot.truyum.model.CartItem;



public interface CartDao {
		List<CartItem> getItemInCart();
		void addCartItem(int itemId);
		void removeCartItem(int itemId);
	}

