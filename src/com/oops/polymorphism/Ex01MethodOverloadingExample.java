package com.oops.polymorphism;

public class Ex01MethodOverloadingExample {

	void show() {
		System.out.println("Show()");
	}

	void show(int a) {
		System.out.println("Show(int)                   " + a);
	}

	void show(String b) {
		System.out.println("Show(String)               " + b);
	}

	public static void main(String[] args) {

		Ex01MethodOverloadingExample e = new Ex01MethodOverloadingExample();
		e.show();
		e.show(3);
		e.show("Hi");
	}

}
