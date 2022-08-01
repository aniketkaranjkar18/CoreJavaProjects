package com.cts.springboot.truyum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.springboot.truyum.dao.MenuItemDaoImpl;
import com.cts.springboot.truyum.model.MenuItem;

@Controller
public class MenuItemController {
	
	@Autowired
	MenuItemDaoImpl menuItemDaoImpl;
	
	@RequestMapping("/display")
	public String getMenuItemListAdmin(ModelMap model) {
		List<MenuItem> list = menuItemDaoImpl.getMenuItemAdmin();
		model.put("list", list);
		return "display";
	}
	
	@RequestMapping("/homepage")
	public String getMenuItemListHome(ModelMap model) {
		List<MenuItem> list = menuItemDaoImpl.getMenuItemAdmin();
		model.put("list", list);
		return "homepage";
	}
}
