package com.trickyprograms;

public class Java002 {

	static void staticMethod() {
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		Java002 j = null;
		j.staticMethod();

		// Yes, the code is correct. You can call static methods through reference
		// variable which is pointing to null. Output will be,
		// Static Method

	}

}
