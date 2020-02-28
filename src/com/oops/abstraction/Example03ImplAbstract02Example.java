package com.oops.abstraction;

public class Example03ImplAbstract02Example extends Example02BasicAbstractMethod {

	@Override
	void abstractMethod() {
		System.out.println("Hello, This is Abstract IMPL");

	}

	public static void main(String[] args) {

		Example03ImplAbstract02Example e = new Example03ImplAbstract02Example();
		e.normalMethod();
		e.abstractMethod();
		e.abstractMethod2();
		e.b();

	}

	@Override
	void abstractMethod2() {
		System.out.println("Hello, This is Abstract IMPL 2");
	}

}
