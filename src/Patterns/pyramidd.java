package Patterns;

public class pyramidd {

	public static void main(String[] args) {
		
		for(int i = 1; i<=4; i++) {
			for(int j = 4-i; j>=1;j--) {
				System.out.print(" ");
			}
			for(int z = 1; z <= (2 * i - 1); z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
