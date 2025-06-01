package com.ggn.probs.design.principles;

//Dont repeat yourself
public class DRY {

	public static void main(String[] args) {
		// Repeating yourself
		int id = 1;
		String name = "Alex";

		System.out.println("Id : " + id + " Name : " + name);

		id = 2;
		name = "Devid";

		System.out.println("Id : " + id + " Name : " + name);

		// Dry Application
		Employee[] emps = { new Employee(1, "Alex"), new Employee(2, "Devid") };
		for (Employee emp : emps) {
			emp.print();
		}

	}

}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void print() {
		System.out.println("Id : " + id + " Name : " + name);
	}
}
