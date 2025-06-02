package com.ggn.probs.design.patterns.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private Connection connection = null;
	
	public DBConnection() {
		try {
			connection = DriverManager.getConnection("URL", "USER", "PASSWORD");
		}catch(Exception ex) {
			System.out.println("Error creating DB Connection : " + ex.getMessage());
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
}
