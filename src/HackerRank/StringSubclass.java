package HackerRank;

import java.util.Scanner;

public class StringSubclass {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your query");

		String name = s.next();

		int start = s.nextInt();
		int end = s.nextInt();

		System.out.println( name.substring(start, end) );
	}
}
