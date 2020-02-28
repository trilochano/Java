package com.oops.polymorphism;

public class Ex02MethodOverriding extends A {

	@Override
	void mymethod() {
		super.mymethod();
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		Ex02MethodOverriding e = new Ex02MethodOverriding();
		e.mymethod();

	}

}
