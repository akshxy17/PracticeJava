package project;

import java.util.Scanner;

public class ChatBot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//asking name
		System.out.println("What's your Cute Name?");
		String name = scanner.nextLine();
		System.out.println("Okay Cutie!");
		
		//Do you miss me
		System.out.println("Are you missing me ?");
		String miss = scanner.nextLine();
		//System.out.println(miss);
		System.out.println("okay");
	
		
		//Baytiki veldama
		System.out.println("Cheppu! Bayta veldhama?");
		String say = scanner.nextLine();
		System.out.println("okay le nee istam");

	}

}
