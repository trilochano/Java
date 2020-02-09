package com.arraysprograms;

public class Example07SecondLargestNumberInAnArray {

	public static int getSecondLargest(int[] a, int total) {

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
		return a[total - 2];

	}

	public static void main(String[] args) {

		int a[] = { 23, 89, 3, 90, 900 };
		int secondLargest = getSecondLargest(a, a.length);
		System.out.println("Second Largest Number   :" + secondLargest);

	}

}
