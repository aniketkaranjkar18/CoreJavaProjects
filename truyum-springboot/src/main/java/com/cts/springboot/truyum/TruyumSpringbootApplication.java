package com.cts.springboot.truyum;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.springboot.truyum.dao.MenuItemDaoImpl;
import com.cts.springboot.truyum.model.MenuItem;


@SpringBootApplication
public class TruyumSpringbootApplication {


	private static final Logger LOGGER = LoggerFactory.getLogger(TruyumSpringbootApplication.class);
	private static MenuItemDaoImpl menuItemDaoImpl;
	public static void main(String[] args) {
		//SpringApplication.run(TruyumSpringbootApplication.class, args);
		ApplicationContext context = SpringApplication.run(TruyumSpringbootApplication.class, args);
		menuItemDaoImpl = context.getBean(MenuItemDaoImpl.class);
		testGetMenu();
	}
	
	private static void testGetMenu() {
		LOGGER.info("Start");
		List<MenuItem> menu = menuItemDaoImpl.getMenuItemAdmin();
		LOGGER.debug("Menu={}", menu);
		LOGGER.info("End");
	}

}
