package com.ggn.probs.design.patterns.uber.entity;

import java.util.UUID;

public class Driver {
	private UUID id;
	private String name;
	private String mobileNo;
	private String carRegNo;
	private String rating;

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCarRegNo() {
		return carRegNo;
	}

	public void setCarRegNo(String carRegNo) {
		this.carRegNo = carRegNo;
	}

}
