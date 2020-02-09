package com.numbersprograms;

import java.util.Scanner;

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
public class Example11FloydsTrianglePrint {

	public static void main(String[] args) {

		System.out.println("How many rows you want in Floyd's Triangle?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int value = 1;
		System.out.println("Floyd's Triangle : ");
		for (int i = 1; i <= noOfRows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value + " ");
				value++;
			}

			System.out.println();
		}

	}

}
