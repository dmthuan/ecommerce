package com.ecommerce.model;

import java.util.Date;

public class Rule {
	 private Date fromDate;
	 private Date toDate;
	 private GroupList group;
	 private String color;
	 private int subtotal;
	 private int discount;
	 
	 public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public GroupList getGroup() {
		return group;
	}
	public void setGroup(GroupList group) {
		this.group = group;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
