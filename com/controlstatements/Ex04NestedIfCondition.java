package com.controlstatements;

public class Ex04NestedIfCondition {

	public static void main(String[] args) {
		int age = 20;
		int weight = 40;
		if (age > 18) {
			if (weight > 50) {
				System.out.println("You Are Eligible To Denote Blood");
			} else {
				System.out.println("You Are Not Eligible To Denote Blood");

			}
		} else {
			System.out.println("Age Must Be Greater Than 18");

		}

	}

}
