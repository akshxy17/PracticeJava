package project;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter your marks!");
		int marks = ip.nextInt();
		if(marks < 35) {
			System.out.println("You idiot you failed");
		}
		else if(marks >=35 && marks < 60) {
			System.out.println("passed: third class");
		}
		else if(marks >=60 && marks <85) {
			System.out.println("passed: second class");
		}
		else {
			System.out.println("passed: first class");
		}
	}
}
