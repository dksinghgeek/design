package com.ggn.probs.design.principles.solid;

//Single responsibilty principle Validation and save is in different class
public class SingleResponsibilty {
	public void processEmployee(Employee emp, DB db) {
		if (DataValidation.validate(emp)) {
			db.save(emp);
		}
	}

	public static void main(String[] args) {
		SingleResponsibilty op = new SingleResponsibilty();
		Employee emp = new Employee(1, "Alex");
		DB db = new DB();

		op.processEmployee(emp, db);
	}

}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int id() {
		return id;
	}

	public String name() {
		return name;
	}
}

class DataValidation {
	public static boolean validate(Employee emp) {
		System.out.println("Validate id : " + emp.id() + " name " + emp.name());
		return true;
	}
}

class DB {
	public void save(Employee emp) {
		System.out.println("Saved id : " + emp.id() + " name " + emp.name());
	}
}
