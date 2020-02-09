package com.arrays;

public class Example06FindSmallestValueInAnArray {

	public static void main(String[] args) {

		/*
		 * @SuppressWarnings("resource") Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter No of Elements you want in array"); int n =
		 * sc.nextInt(); int a[] = new int[n]; int min = a[0];
		 * System.out.println("Enter all the elements");
		 * 
		 * for (int i = 0; i < a.length; i++) { a[i] = sc.nextInt();
		 * 
		 * }
		 */

		int a[] = new int[] { 22, 90, 67, 9 };
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Smallest Number   :" + min);
	}

}
