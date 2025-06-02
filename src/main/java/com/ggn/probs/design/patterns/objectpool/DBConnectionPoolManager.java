package com.ggn.probs.design.patterns.objectpool;


// connection pool with initial size of 3 and max size of 6
import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
	private List<DBConnection> freeConnections = null;
	private List<DBConnection> aquiredConnections = null;
	private int INITIAL_CONNECTION = 3;
	private int MAX_CONNECTION = 6;
	private static DBConnectionPoolManager instance = null;

	private DBConnectionPoolManager() {
		if (instance == null) {
			freeConnections = new ArrayList<>();
			aquiredConnections = new ArrayList<>();

			for (int i = 0; i < INITIAL_CONNECTION; i++) {
				freeConnections.add(new DBConnection());
			}
		}
	}

	public static DBConnectionPoolManager getInstance() {
		if (instance == null) {
			synchronized (DBConnectionPoolManager.class) {
				if (instance == null) {
					instance = new DBConnectionPoolManager();
				}
			}
		}
		return instance;
	}

	public synchronized DBConnection getConnection() {
		if (freeConnections.isEmpty() && aquiredConnections.size() < MAX_CONNECTION) {
			freeConnections.add(new DBConnection());
		} else if (freeConnections.isEmpty() && aquiredConnections.size() >= MAX_CONNECTION) {
			return null;
		}

		System.out.println("Connection aquired : " + aquiredConnections.size());
		System.out.println("Connection available : " + freeConnections.size());
		DBConnection dbConnection = freeConnections.remove(freeConnections.size() - 1);
		aquiredConnections.add(dbConnection);
		return dbConnection;
	}

	public synchronized void releaseConnection(DBConnection dbConnection) {
		if (dbConnection != null) {
			aquiredConnections.remove(dbConnection);
			freeConnections.add(dbConnection);
			System.out.println("Connection aquired : " + aquiredConnections.size());
			System.out.println("Connection available : " + freeConnections.size());
		}
	}
}
