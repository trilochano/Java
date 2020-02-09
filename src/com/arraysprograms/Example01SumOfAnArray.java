package com.arraysprograms;


import java.util.Scanner;

public class Example01SumOfAnArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements you want an array");
		int num = sc.nextInt();
		int sum = 0;
		int a[] = new int[num];
		System.out.println("Enter all the elements");

		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];

		}
		System.out.println("Sum of an Array is  :" + sum);

	}

}
