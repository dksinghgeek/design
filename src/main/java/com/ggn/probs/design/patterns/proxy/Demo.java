package com.ggn.probs.design.patterns.proxy;

public class Demo {

	public static void main(String[] args) {
		try {
			EmployeeDao employeeDao = new EmployeeDao();
			Cache cache = new EmployeeProxy(employeeDao);
			cache.create("ADMIN", new Employee());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
