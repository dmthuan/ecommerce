package com.ecommerce.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
	
	private User user;
	
	private List<Product> listProduct;
	
	private int priceTotal;
	
	private Rule rule;
	
	public Rule getRule() {
		return rule;
	}
	
	public void setRule(Rule rule) {
		this.rule = rule;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Product> addProduct(Product product){
		if(listProduct == null) {
			listProduct = new ArrayList<Product>();
		}
		listProduct.add(product);
		return listProduct;
	}
	
	public List<Product> removeProduct(Product product){
		if(listProduct == null) {
			listProduct = new ArrayList<Product>();
		}
		listProduct.remove(product);
		return listProduct;
	}
	
	public int getPriceTotal() {
		int price4Rule = 0;
		priceTotal = 0;
		for(Product item : listProduct) {
			//if product met rule, increase price4Rule
			if(isDiscount(item)) {
				price4Rule += item.getPrice();
			}
			priceTotal += item.getPrice();
		}
		if(rule != null) {
			if(price4Rule >= rule.getSubtotal()) {
				priceTotal -= rule.getDiscount();
			}
		}
		return priceTotal;
	}
	
	public Boolean isDiscount(Product item) {
		try {
			if(rule != null) {
				Date current = new Date();
				if(current.compareTo(rule.getFromDate()) >= 0
					&& current.compareTo(rule.getToDate()) <= 0
					&& user.getGroup().equals(rule.getGroup())
					&& item.getColor().equals(rule.getColor())){
					return true;
				}
			}
			return false;
		}catch(Exception ex) {
			return false;
		}
	}
}
