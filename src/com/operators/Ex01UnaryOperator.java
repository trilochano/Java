package com.operators;

public class Ex01UnaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		// Postfix And Prefix Increment
		System.out.println(x++);// 10
		System.out.println(x);// 11
		System.out.println(++x);// 12
		System.out.println(++x + x++);// 13+13=26
		System.out.println(x++ + ++x);// 14+16=29
		System.out.println(++x + ++x);// 17+18=35
		System.out.println("Where X is:  " + x);// x=18

		System.out.println("-------------------------------");

		// Postfix And Prefix Increment
		System.out.println(y--);// 20
		System.out.println(y);// 19
		System.out.println(--y);// 18
		System.out.println(--y + y--);// 17+17=34
		System.out.println(--y + --y);// 15+14=29
		System.out.println("Where Y is:  " + y);// y=14

		System.out.println("----------------------------------");

		System.out.println(x++ + ++y);// 18+15=33
		System.out.println(x-- - ++y);// 19-16=3
		System.out.println(--x + --y);// 17+15=32
		System.out.println(x++ + y--);// 17+15=32
		System.out.println(x + y);// 18+14=32

	}

}
