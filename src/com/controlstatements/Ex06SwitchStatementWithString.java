package com.controlstatements;

public class Ex06SwitchStatementWithString {

	public static void main(String[] args) {

		String levelString = "Expert";
		int level = 0;
		switch (levelString) {
		case "Bengineer":
			level = 1;
			break;
		case "Intermedite":
			level = 2;
			break;
		case "Expert":
			level = 3;
			break;
		default:
			level = 0;
			break;

		}

		System.out.println("Your Level is:" + level);

	}

}
