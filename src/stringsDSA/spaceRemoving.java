package stringsDSA;

import java.util.Scanner;

public class spaceRemoving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your String!");//Probing
		
		String text = input.nextLine();//Storing input in variable
		
		System.out.println("length: " + text.length());
		
		System.out.println("Removing all spaces: " + text.trim().length());
		
		

	}

}
