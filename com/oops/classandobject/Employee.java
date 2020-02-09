package com.oops.classandobject;

public class Employee {

	int eid;
	String ename;

	
	public void insert(int id,String name) {
		eid=id;
		ename=name;
	}
	
	
	public void display() {
		System.out.println(eid + " " + ename);
	}

}
