package com.ggn.probs.design.patterns.objectpool;


public class Demo {

	public static void main(String[] args) {
		DBConnectionPoolManager pool = DBConnectionPoolManager.getInstance();
		DBConnection connection1 = pool.getConnection();
	}

}
