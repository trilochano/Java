package com.numbersprograms;

public class Example12ArmStrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int c = 0, q;

		while (num > 0) {
			q = num % 10;
			c = c + (q * q * q);
			num = num / 10;
		}

		if (temp == c) {
			System.out.println("ArmStrong");
		} else {
			System.out.println("Not ArmStrong");
		}

	}

}
