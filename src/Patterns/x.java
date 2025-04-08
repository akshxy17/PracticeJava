package Patterns;

public class x {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {  // Outer loop for rows
            for (int j = 0; j < 7; j++) {  // Inner loop for columns
                if (i == j || i + j == 7 - 1) {  // Conditions for X pattern
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        } 

	}

}
