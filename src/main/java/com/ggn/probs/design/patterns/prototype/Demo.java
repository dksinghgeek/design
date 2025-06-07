package com.ggn.probs.design.patterns.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		User student = new Student(1, "Alex", "CSE");
		
		Student studentCopy = (Student)student.clone();
	}

}
