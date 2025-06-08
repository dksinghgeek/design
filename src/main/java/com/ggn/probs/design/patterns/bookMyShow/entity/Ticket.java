package com.ggn.probs.design.patterns.bookMyShow.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.ggn.probs.design.patterns.bookMyShow.enums.TicketStatus;

public class Ticket {
	private UUID ticketNo;
	private long userId;
	private long theatreId;
	private long movieId;
	private TicketStatus ticketStatus;
	private double total;
	private List<Seat> seats;

	public Ticket() {
		this.seats = new ArrayList<Seat>();
	}

	public UUID getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(UUID ticketNo) {
		this.ticketNo = ticketNo;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}

	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Seat> getSeat() {
		return seats;
	}

	public void addSeat(Seat seat) {
		this.seats.add(seat);
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

}
