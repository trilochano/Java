
package com.string;

public class StringCreation {

	public static void main(String[] args) {

		// 1.By Using Literal
		String byLiteral = "QA";

		System.out.println(byLiteral);

		// 2.By Using New Keyword
		String byNew = new String("qa");
		System.out.println(byNew);

		char str[] = { 'h', 'i' };
		// converting char array str[] to string strArrayChar
		String strArrayChar = new String(str);
		System.out.println(strArrayChar.toUpperCase());

		// Checking byLiteral and ByNew

		// 1.Equals() checking "Content"
		System.out.println("1.Equals() checking \"Content\"");
		System.out.println(byLiteral.equals(byNew));
		System.out.println(byLiteral.equalsIgnoreCase(byNew));

		// 2.== Operator Checking "Reference"
		System.out.println("2.== Operator Checking \"Reference\"");
		System.out.println(byLiteral == byNew);

		// 3.Compare() Checking "UniCode"
		System.out.println("3.Compare() Checking \"UniCode\"");
		System.out.println(byLiteral.compareTo(byNew));
		System.out.println(byLiteral.compareToIgnoreCase(byNew));

	}

}
