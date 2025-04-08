package project;

import java.util.Scanner;

public class Weekdays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//enter your day
		System.out.println("Enter your day");
		String day = input.nextLine();
		switch(day) {
		case "mon":
			System.out.println("hey, it's a weekday");
					break;
		case "tue":
			System.out.println("hey, it's a weekday");
					break;
		case "wed":
			System.out.println("hey, it's a weekday");
					break;
		case "thur":
			System.out.println("hey, it's a weekday");
					break;
		case "fri":
			System.out.println("hey, it's a weekday");
					break;
		case "satur":
			System.out.println("hey, it's a weekend");
					break;
		case "sun":
			System.out.println("hey, it's a weekdend");
					break;
					default:
						System.out.println("lets see");
		}
		
	}
}
