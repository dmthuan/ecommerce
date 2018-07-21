package com.ecommerce.controller;

import java.util.Date;

import com.ecommerce.model.GroupList;
import com.ecommerce.model.Product;
import com.ecommerce.model.Rule;
import com.ecommerce.model.ShoppingCart;
import com.ecommerce.model.User;

//1. Create a User "John Doe 1", Group GOLD with email address "john.doe@example.com",
//then add 2 "Iphone Sliver" Products for $999 each and 1 "Iphone Black" Product for
//$899. Check that the ShoppingCart total price is correct.
//2. Create a Rule with From Date, To Date, User Group GOLD, Color Black, Subtotal 1500$,
//Discount: 50$
//3. Check the ShoppingCart total after applying the promotion rule.

public class ECommerceController {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("---***Task E-commerce***---");
		
		User user = new User();
		user.setName("John Doe 1");
		user.setGroup(GroupList.GOLD);
		user.setEmail("john.doe@example.com");
		
		Product ipSliver = new Product();
		ipSliver.setName("Iphone Sliver");
		ipSliver.setColor("Sliver");
		ipSliver.setPrice(999);
		
		Product ipBlack = new Product();
		ipBlack.setName("Iphone Black");
		ipBlack.setColor("Black");
		ipBlack.setPrice(899);
		
		ShoppingCart cart = new ShoppingCart();
		cart.setUser(user);
		cart.addProduct(ipSliver);
		cart.addProduct(ipSliver);
		cart.addProduct(ipBlack);
		
		System.out.println("Total Price HAS NOT rule: $" + cart.getPriceTotal());
		
		Rule rule = new Rule();
		rule.setFromDate(new Date("2018/06/20 00:00:00"));
		rule.setToDate(new Date("2018/07/21 24:00:00"));
		rule.setGroup(GroupList.GOLD);
		rule.setColor("Black");
		rule.setSubtotal(1500);
		rule.setDiscount(50);
		
		cart.setRule(rule);

		System.out.println("Total Price HAS rule: $" + cart.getPriceTotal());
	}
}
