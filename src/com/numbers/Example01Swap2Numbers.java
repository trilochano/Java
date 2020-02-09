package com.numbers;

public class Example01Swap2Numbers {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("Before Swapping   :" + a + " " + b);

		// Logic 1-Use With Third Variable

		int temp = a; // temp=10
		a = b; // a=20
		b = temp; // b=10

		// Logic 2-Use With out Third variable(+,-)

		a = a + b;// 10+20=30
		b = a - b;// 30-20=10
		a = a - b;// 30-10=20

		// Logic 3-Use * And /
		// Here values should not be zero any one

		a = a * b;// 10*20=200
		b = a / b;// 200/20=10
		a = a / b;// 200/10=20

		// Logic 4-Use Bitwise XOR (^)(convert into binary and then return binary after
		// that convert into decimal)

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		// Logic 5-use single statement
		b = a + b - (a = b);

		System.out.println("After Swapping    :" + a + " " + b);

	}

}
