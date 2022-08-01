package com.cts.springboot.truyum.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cts.springboot.truyum.model.MenuItem;
import com.cts.springboot.truyum.service.MenuItemMapper;

@Component
public class MenuItemDaoImpl implements MenuItemDao {

	@Autowired
	MenuItemMapper menuItemMapper;

	@Override
	public List<MenuItem> getMenuItemAdmin() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbc = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "select * from menu_item";
		List<MenuItem> list = jdbc.query(sql, menuItemMapper);
		ctx.close();
		return list;
	}

	@Override
	public void editMenu(int itemId, String name, int price) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbc = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "update menu_item set me_name = ? , me_price = ? where me_id = ?;";
		jdbc.update(sql,name,price,itemId);
		ctx.close();
	}

}
