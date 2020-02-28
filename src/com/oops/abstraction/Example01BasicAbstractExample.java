package com.oops.abstraction;

public abstract class Example01BasicAbstractExample {

	void b() {
		System.out.println("Hello I am Normal Method");
	}

	abstract void abstractMethod();

	public static void main(String[] args) {
		Example01BasicAbstractExample e = new Example01BasicAbstractExample() {

			@Override
			void abstractMethod() {
				System.out.println("Hello I am Abstract Method");

			}
			// e.normalMethod();
			// e.abstractMethod();
		};

	}

}
