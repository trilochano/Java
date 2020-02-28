package com.oops.abstraction;

public abstract class Example02BasicAbstractMethod extends Example01BasicAbstractExample{

	void normalMethod() {
		System.out.println("Hello I am Normal Method");
	}
	
	@Override
	void b() {

	System.out.println("Super Class Method");
	}

	abstract void abstractMethod();
	abstract void abstractMethod2();

}
