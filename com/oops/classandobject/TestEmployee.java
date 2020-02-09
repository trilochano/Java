package com.oops.classandobject;

//Object and Class Example: main outside the class
public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();

		/*
		 * e.eid=101; e.ename="Trill";
		 */
		e.insert(101, "Tri");

		System.out.println(e.eid);
		System.out.println(e.ename);
	}
}
