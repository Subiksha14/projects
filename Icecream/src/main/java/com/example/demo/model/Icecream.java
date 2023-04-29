package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Icecream {

	@Id
	public int customerid;
	private String shopname;
	private String shopaddress;
	private String icecreamflavor;
	private String icecreamtoppins;
	private String dailysale;
	private String ingredients;
	private String expiredate;
	public int cost;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopaddress() {
		return shopaddress;
	}
	public void setShopaddress(String shopaddress) {
		this.shopaddress = shopaddress;
	}
	public String getIcecreamflavor() {
		return icecreamflavor;
	}
	public void setIcecreamflavor(String icecreamflavor) {
		this.icecreamflavor = icecreamflavor;
	}
	public String getIcecreamtoppins() {
		return icecreamtoppins;
	}
	public void setIcecreamtoppins(String icecreamtoppins) {
		this.icecreamtoppins = icecreamtoppins;
	}
	public String getDailysale() {
		return dailysale;
	}
	public void setDailysale(String dailysale) {
		this.dailysale = dailysale;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}