package com.ggn.probs.design.patterns.bookMyShow.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ggn.probs.design.patterns.bookMyShow.entity.Movie;
import com.ggn.probs.design.patterns.bookMyShow.entity.Screen;
import com.ggn.probs.design.patterns.bookMyShow.entity.Theatre;

public class TheatreManager {
	private static volatile TheatreManager instance = null;
	private Map<String, List<Theatre>> map;
	private Map<Integer, Movie> movies;

	private TheatreManager() {
		if (instance != null) {
			System.out.println("Only one instance of Theatre Manager is allowed");
		} else {
			initialiazedTheatre();
			initializedMovies();
		}
	}

	public static TheatreManager getInstance() {
		if (instance == null) {
			synchronized (TheatreManager.class) {
				if (instance == null) {
					instance = new TheatreManager();
				}
			}
		}

		return instance;
	}

	public List<Theatre> getTheatreByCity(String city) {
		return map.get(city);
	}

	public Theatre getTheatreByName(List<Theatre> theatres, String theatreName) {
		for (Theatre th : theatres) {
			if (th.getName().equals(theatreName)) {
				return th;
			}
		}
		return null;
	}

	public Movie getMovieByName(Theatre theatre, String movieName) {
		for (Screen sc : theatre.getScreens()) {
			if (movies.get(sc.getMovieId()).getName().equals(movieName)) {
				return movies.get(sc.getMovieId());
			}
		}
		return null;
	}

	public List<String> getAllMoviesByCity(String city) {
		List<Theatre> theatreInGivenCity = map.get(city);
		List<String> localMovies = new ArrayList<>();

		for (Theatre th : theatreInGivenCity) {
			for (Screen sc : th.getScreens()) {
				String movie = movies.get(sc.getMovieId()).getName();
				localMovies.add(movie);
			}
		}

		return localMovies;
	}

	public List<String> getAllMoviesByTheatre(String city, String theatreName) {
		List<String> localMovies = new ArrayList<>();
		List<Theatre> theatreInGivenCity = map.get(city);
		for (Theatre th : theatreInGivenCity) {
			if (th.getName().equals(theatreName)) {
				for (Screen sc : th.getScreens()) {
					String movie = movies.get(sc.getMovieId()).getName();
					localMovies.add(movie);
				}
			}
		}

		return localMovies;

	}

	public Movie getMovieByCityAndTheatre(String city, String theatreName, String movieName) {
		List<String> localMovies = new ArrayList<>();
		List<Theatre> theatreInGivenCity = map.get(city);
		for (Theatre th : theatreInGivenCity) {
			if (th.getName().equals(theatreName)) {
				for (Screen sc : th.getScreens()) {
					Movie movie = movies.get(sc.getMovieId());
					if (movie.getName().equals(movieName)) {
						return movie;
					}
				}
			}
		}
		return null;
	}

	private void initialiazedTheatre() {
		map = new HashMap<String, List<Theatre>>();
		List<Theatre> theatres = new ArrayList<>();

		Theatre localTheatre = new Theatre();
		List<Screen> screens = new ArrayList<Screen>();

		Screen localScreen = new Screen();
		localScreen.setScreenNo(1);
		localScreen.setMovieId(2);
		localScreen.getSeats().put('A', new ArrayList<>());
		localScreen.getSeats().put('B', new ArrayList<>());

		screens.add(localScreen);
		localTheatre.setScreens(screens);
		localTheatre.setId(1);
		localTheatre.setName("PVR");
		localTheatre.setAddress("Sector 65");

		theatres.add(localTheatre);
		map.put("GURGAON", theatres);

	}

	private void initializedMovies() {
		movies = new HashMap<>();
		movies.put(1, new Movie(1, "DCH", 300));
		movies.put(2, new Movie(2, "KKKG", 400));
		movies.put(3, new Movie(3, "YDMM", 350));
		movies.put(4, new Movie(4, "DDD", 250));
	}
}
