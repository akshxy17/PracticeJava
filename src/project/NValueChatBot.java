package project;

import java.util.Scanner;

public class NValueChatBot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your n value?");
		int n = input.nextInt();

		if (n % 2 != 0) { // Check if the value is odd
			System.out.println("wired");
		}
		else {
			if( n >= 2 && n <=5) {
				System.out.println("Not Wired");
			}
			else if(n>=6 && n<=20) {
				System.out.println("wired");
			}
		}

		input.close(); // Close the scanner
	}
}
