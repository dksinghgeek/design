package com.ggn.probs.design.patterns.bookMyShow.entity;

import com.ggn.probs.design.patterns.bookMyShow.enums.SeatType;

public class Seat {
	private int seatNo;
	private boolean isAvailable;
	private SeatType seatType;
	
	public Seat(int seatNo, boolean isAvailable, SeatType seatType) {
		this.seatNo = seatNo;
		this.isAvailable = isAvailable;
		this.seatType = seatType;
	}

	public Seat() {
		this.isAvailable = true;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
