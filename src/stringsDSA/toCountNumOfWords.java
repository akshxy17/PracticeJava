package stringsDSA;

import java.util.Scanner;

public class toCountNumOfWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your text!");
		
		String text = input.nextLine();//Lets take text as input
		
		String[] words = text.split(" ");
		
		System.out.println("Number of words in given string is "+ words.length);

	}

}
