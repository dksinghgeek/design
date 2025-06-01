package com.ggn.probs.design.principles;

//You arent Gonna need it
public class YAGNI {

	public static void main(String[] args) {
		//Requirement is only circle. Dont create Square class
	}

}

interface Shape {
	public void draw();
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square");
	}

}
