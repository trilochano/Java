package com.arraysprograms;


public class Example04MissingNumberInAnArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,7,8};
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];

		}
		System.out.println("Total Sum1  : " + sum1);

		int sum2 = 0;

		for (int i = 1; i <= 8; i++) {
			sum2 = sum2 + i;

			
		}
		System.out.println("Total Sum2   : " + sum2);
		System.out.println("Missing Number    " + (sum2 - sum1));
	}

}
