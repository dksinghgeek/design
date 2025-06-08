package com.ggn.probs.design.patterns.bookMyShow.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Screen {
	private int screenNo;
	private int movieId;
	private Map<Character, List<Seat>> seats;

	public Screen() {
		seats = new HashMap<>();
	}

	public int getScreenNo() {
		return screenNo;
	}

	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}

	public Map<Character, List<Seat>> getSeats() {
		return seats;
	}

	public void updateSeat(Character row, Seat seat) {
		if (seats.containsKey(row)) {
			List<Seat> s = seats.get(row);
			s.add(seat);
			seats.put(row, s);
		}
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

}
