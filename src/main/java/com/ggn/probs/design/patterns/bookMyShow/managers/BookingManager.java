package com.ggn.probs.design.patterns.bookMyShow.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.ggn.probs.design.patterns.bookMyShow.entity.Movie;
import com.ggn.probs.design.patterns.bookMyShow.entity.Seat;
import com.ggn.probs.design.patterns.bookMyShow.entity.Theatre;
import com.ggn.probs.design.patterns.bookMyShow.entity.Ticket;
import com.ggn.probs.design.patterns.bookMyShow.enums.SeatType;
import com.ggn.probs.design.patterns.bookMyShow.payment.UPI;

public class BookingManager {
	private static volatile BookingManager instance = null;
	private TheatreManager theatreManager = TheatreManager.getInstance();
	private PaymentManager paymentManager = PaymentManager.getInstance();

	private BookingManager() {
		if (instance != null) {
			System.out.println("Only one instance of Booking Manager is allowed");
		}
	}

	public static BookingManager getInstance() {
		if (instance == null) {
			synchronized (BookingManager.class) {
				if (instance == null) {
					instance = new BookingManager();
				}
			}
		}
		return instance;
	}

	public List<String> getAllMovieByCity(String city) {
		List<String> theatres = new ArrayList<>();
		for (Theatre localTheatre : theatreManager.getTheatreByCity(city)) {
			theatres.add(localTheatre.getName());
		}
		return theatreManager.getAllMoviesByCity(city);
	}

	public List<String> getAllMovieByTheatre(String city, String theatreName) {
		return theatreManager.getAllMoviesByTheatre(city, theatreName);
	}

	public void bookShow(String city, String theatreName, String movieName) {
		List<Theatre> theatres = theatreManager.getTheatreByCity(city);
		System.out.println("Theatres in selected city : " + theatres);
		
		Theatre theatre = theatreManager.getTheatreByName(theatres, theatreName);
		System.out.println("Theatre : " + theatre.getName());
		
		Movie movie = theatreManager.getMovieByName(theatre, movieName);
		System.out.println("Movie : " + movie.getName());
		
		movie.setPrice(100.00);
		
		System.out.println("Select Payment type");
		paymentManager.setPayment(new UPI());
		if(paymentManager.pay(movie.getPrice())) {
			generateTicket(theatre, movie);
		}
		
		
	}

	private void generateTicket(Theatre theatre, Movie movie) {
		Ticket ticket = new Ticket();
		ticket.setTicketNo(UUID.randomUUID());
		ticket.addSeat(new Seat(1, false, SeatType.PLATINUM));
		ticket.setTheatreId(theatre.getId());
		ticket.setUserId(123);
		ticket.setTotal(movie.getPrice());
		ticket.setMovieId(movie.getId());
		
		System.out.println("Ticket No. " + ticket.getTicketNo());
		System.out.println("Theatre Id. " + ticket.getTheatreId());
		System.out.println("User No. " + ticket.getUserId());
		System.out.println("Seat No. " + ticket.getSeat().get(0).getSeatNo());
		System.out.println("Ticket Price. " + ticket.getTotal());
		System.out.println("Movie Id. " + ticket.getMovieId());
		
	}
}
