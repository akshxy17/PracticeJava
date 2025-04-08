package stringsDSA;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your text");//
		
		String text = input.nextLine();
		
		String reverse = new StringBuilder(text).reverse().toString();
		
		System.out.println("Reverse is: " + reverse);
	}

}
