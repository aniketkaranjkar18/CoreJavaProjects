package com.cts.springboot.truyum.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cts.springboot.truyum.model.CartItem;
import com.cts.springboot.truyum.model.MenuItem;
import com.cts.springboot.truyum.service.CartMapper;

@Component
public class CartDaoImpl implements CartDao {

	@Autowired
	CartMapper cartMapper;

	@Override
	public List<CartItem> getItemInCart() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbc = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "select * from cart";
		List<CartItem> cartList = jdbc.query(sql, cartMapper);
		ctx.close();
		return cartList;
	}

	@Override
	public void addCartItem(int itemId) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbc = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "INSERT INTO cart (cart_id, Cart_name, cart_price)\r\n"
				+ "SELECT me_id, me_name, me_price\r\n"
				+ "FROM menu_item\r\n"
				+ "WHERE menu_id = ?;";
		jdbc.update(sql, itemId);
		ctx.close();
	}

	@Override
	public void removeCartItem(int itemId) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbc = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "delete from cart where cart_id = ?;";
		jdbc.update(sql, itemId);
		ctx.close();
	}

}
