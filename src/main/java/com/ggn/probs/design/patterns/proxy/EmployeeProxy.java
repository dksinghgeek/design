package com.ggn.probs.design.patterns.proxy;

public class EmployeeProxy implements Cache {
	private EmployeeDao employeeDao;

	public EmployeeProxy(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void create(String client, Employee employee) throws Exception{
		if(client.equals("ADMIN")) {
			employeeDao.create(client, employee);
			return;
		}
		
		throw new Exception("ACCESS DENIED");
	}

	@Override
	public void update(String client, long id) throws Exception{
		if(client.equals("ADMIN")) {
			employeeDao.update(client, id);
			return;
		}
		
		throw new Exception("ACCESS DENIED");
	}

	@Override
	public Employee get(String client, long id) throws Exception{
		return employeeDao.get(client, id);
	}

}
