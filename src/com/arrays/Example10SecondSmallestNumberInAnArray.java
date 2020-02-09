package com.arrays;

public class Example10SecondSmallestNumberInAnArray {

	public static int getSecondSmallest(int[] a, int total) {
		int temp;

		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a[1];

	}

	public static void main(String[] args) {
		int a[] = { 23, 90, 78, 6778, 900 };
		int secondSmallest = getSecondSmallest(a, a.length);
		System.out.println("Second Smallest Number   :" + secondSmallest);

	}

}
