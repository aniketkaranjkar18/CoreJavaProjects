package com.cts.springboot.truyum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.springboot.truyum.dao.CartDaoImpl;
import com.cts.springboot.truyum.dao.MenuItemDaoImpl;
import com.cts.springboot.truyum.model.CartItem;
import com.cts.springboot.truyum.model.MenuItem;

@Controller
	public class secondController {
	
	@Autowired
	MenuItemDaoImpl menuItemDaoImpl;
	
	@Autowired
	CartDaoImpl cartDaoImpl;
	
	@RequestMapping(value="/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/signup")
	public String signupPage() {
		
		return "signup";
	}

	@RequestMapping(value="/adminLogin")
	public String adminEnter(ModelMap model) {
		List<MenuItem> list = menuItemDaoImpl.getMenuItemAdmin();
		model.put("list", list);
		return "adminLogin";
	}
	
	@RequestMapping(value="/userLogin")
	public String userEnter(ModelMap model) {
		List<MenuItem> list = menuItemDaoImpl.getMenuItemAdmin();
		model.put("list", list);
		return "userLogin";
	}
	
	@RequestMapping(value="/adminCart")
	public String adminCart(ModelMap model) {
		return "adminCart";
	}
	
	@RequestMapping(value="/edit")
	public String edit(ModelMap model) {
		return "edit";
	}
	
	/*@RequestMapping(value="/editedSuccessfully")
	public String editedSuccessfully(ModelMap model) {
		return "editedSuccessfully";
	}*/
	
	@RequestMapping(value="/userCart")
	public String userCart(ModelMap model) {
		List<CartItem> cartList = cartDaoImpl.getItemInCart();
		model.put("cartList", cartList);
		return "userCart";
	}
	
	@RequestMapping(value="/addedSuccessfully")
	public String addedSuccessfully(ModelMap model) {
		return "addedSuccessfully";
	}
	
	@RequestMapping(value="/add-cart")
	public String addToCart(@RequestParam int id) {
	cartDaoImpl.addCartItem(id);
	return "redirect:/userLogin";
	}
	
	@RequestMapping(value="/removeFromCart")
	public String removeCartItem(@RequestParam int id) {
	cartDaoImpl.removeCartItem(id);
	return "redirect:/userCart";
	}
		
	@RequestMapping(value="/editedSuccessfully")
	public String editedCart(@RequestParam int Item_Number,@RequestParam String Item_Name,@RequestParam int price) {
	menuItemDaoImpl.editMenu(Item_Number, Item_Name, price);
	return "editedSuccessfully";
	}
	
}
