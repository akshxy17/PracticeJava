package stringsDSA;

import java.util.Scanner;

public class toFindWordsOccuracesinString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your text");
		
		String text = input.nextLine(); //stores the value in text variable
		
		System.out.println("which word you want to find?");
		
		String word =input.nextLine();
		
		System.out.println("Number of occuring words are : " + text.contains("word"));

	}

}
