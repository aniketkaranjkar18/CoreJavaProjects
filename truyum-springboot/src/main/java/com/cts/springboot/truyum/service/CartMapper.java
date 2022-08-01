package com.cts.springboot.truyum.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cts.springboot.truyum.model.CartItem;
@Component
public class CartMapper implements RowMapper<CartItem> {

	@Override
	public CartItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		CartItem cartItem = new CartItem();
		cartItem.setId(rs.getInt(1));
		cartItem.setName(rs.getString(2));
		cartItem.setPrice(rs.getInt(3));
		return cartItem;
	}

}
 