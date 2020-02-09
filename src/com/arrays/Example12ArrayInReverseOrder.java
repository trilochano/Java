package com.arrays;

public class Example12ArrayInReverseOrder {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 7, 0, 0, 3, 7 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(" " + a[i]);
		}

	}

}
