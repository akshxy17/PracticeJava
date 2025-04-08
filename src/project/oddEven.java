package project;

import java.util.Scanner;

public class oddEven {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter your number");

		int num = input.nextInt();

		if(num % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}
}
