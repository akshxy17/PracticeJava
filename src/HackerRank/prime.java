package HackerRank;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int num = s.nextInt();
//		int num = 22;
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count = count +1;
			}
		}
		
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("Not a prime");
		}
		
		

	}

}
