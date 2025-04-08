package HackerRank;

public class plus {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Print '*' for the first column, first row, and middle row
                if (j == 0 || i == 0 || i == 5 / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for other positions
                }
            }
            System.out.println();
        }
	}
}

