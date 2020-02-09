package com.string;

public class Immutable {
	public static void main(String[] args) {

		// 1.By Using String Literal
		String s1 = "Reddy";
		s1.concat("Trilochan");
		System.out.println(s1);

		// 2.By Using String New
		String s2 = new String("Reddy");
		s2.concat("Trilochan");
		System.out.println(s2);

		// 3.By StringBuffer
		StringBuffer sb = new StringBuffer("Reddy");
		sb.append("Trilochan");
		System.out.println(sb);
		
		

	}

}
