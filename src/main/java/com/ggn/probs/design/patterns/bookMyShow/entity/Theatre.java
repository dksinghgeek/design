package com.ggn.probs.design.patterns.bookMyShow.entity;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
	private int id;
	private String name;
	private String address;
	private List<Screen> screens;
	
	public Theatre () {
		this.screens = new ArrayList<Screen>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
}
