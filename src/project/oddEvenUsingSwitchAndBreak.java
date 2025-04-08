package project;

import java.util.Scanner;

public class oddEvenUsingSwitchAndBreak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//enter number
		System.out.println("Enter your number");
		int a = input.nextInt();

		switch(a % 2){
		case 0 :
			System.out.println("even");
			break;
		case 1 :
			System.out.println("odd");
			break;
		default:
			System.out.println("unexpected value");
		input.close();
		}
	}

}
