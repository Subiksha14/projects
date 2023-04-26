package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Icecream {

	@Id
	public int customerid;
	private String icecreamflavor;
	private String icecreamtoppins;
	public int cost;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
}