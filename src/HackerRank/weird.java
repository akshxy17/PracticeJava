package HackerRank;

import java.util.Scanner;

public class weird {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n = s.nextInt();
		s.close();
		if(n % 2 == 1) {
			System.out.println("weird");
		}
		else {
			if(n >=2 && n<=5) {
				System.out.println("Not weird");
			}else if(n>=6 && n<=20) {
				System.out.println("Weird");
			} else if(n>20) {
				System.out.println("not weird");
			}
		}
	}

}
