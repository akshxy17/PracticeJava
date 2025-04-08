package project;

import java.util.Scanner;

public class calC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Enter your first number
		System.out.println("Enter your first number");
		int a = input.nextInt();
		//Enter second number
		System.out.println("Enter your second number");
		int b = input.nextInt();
		//Operation wants to perform
		System.out.println("what action want to perform (+,-,*,/,%)");
		char op = input.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("Addition:" + (a+b) );
			break;
		case '-':
			System.out.println("sub:" + (a-b) );
			break;
		case '*':
			System.out.println("mul:" + (a*b) );
			break;
		case '/':
			System.out.println("div:" + (a/b) );
			break;
		case '%':
			System.out.println("mod:" + (a%b) );
			break;
			default:
				System.out.println("something is fishy broo");
		}
	}

}
