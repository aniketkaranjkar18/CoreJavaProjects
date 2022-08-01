package com.personalproject.truyum.dao;

public class CartEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CartEmptyException(String message) {
		super(message);
	}
	
	public CartEmptyException() {
		super("Cart is empty. No items found");
	}

}
