package com.programs.arrays;

public class Example11DuplicateElementsPrint {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 7, 0, 0, 3, 7 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print("  " + a[j]);
				}
			}
		}

	}

}
