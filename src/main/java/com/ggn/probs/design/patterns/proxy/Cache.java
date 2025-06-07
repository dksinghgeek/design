package com.ggn.probs.design.patterns.proxy;

public interface Cache {
	public void create(String client, Employee employee) throws Exception;
	public void update(String client, long id) throws Exception;
	public Employee get(String client, long id) throws Exception;
}
