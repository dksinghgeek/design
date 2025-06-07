package com.ggn.probs.design.patterns.prototype;

public class Student implements User {
	private long id;
	private String name;
	private String branch;

	public Student() {

	}

	public Student(long id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public User clone() throws CloneNotSupportedException {
		return new Student(id, name, branch);
	}

}
