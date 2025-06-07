package com.ggn.probs.design.patterns.proxy;

public class EmployeeDao implements Cache {

	@Override
	public void create(String client, Employee employee) throws Exception{
		System.out.println("Employee created successful in DB");
	}

	@Override
	public void update(String client, long id) throws Exception{
		System.out.println("Employee updated successful in DB");
	}

	@Override
	public Employee get(String client, long id) throws Exception{
		return new Employee();
	}

}
