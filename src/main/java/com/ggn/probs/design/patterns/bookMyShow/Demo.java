package com.ggn.probs.design.patterns.bookMyShow;

import com.ggn.probs.design.patterns.bookMyShow.managers.BookingManager;

public class Demo {

	public static void main(String[] args) {
		BookingManager bookingManager = BookingManager.getInstance();
//		System.out.println(bookingManager.getAllMovieByCity("GURGAON"));
//		
//		System.out.println(bookingManager.getAllMovieByTheatre("GURGAON", "PVR"));
		
		bookingManager.bookShow("GURGAON", "PVR", "KKKG");
	}

}
