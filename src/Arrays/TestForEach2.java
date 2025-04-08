package Arrays;

public class TestForEach2 {

	public static void main(String[] args) {
		int[][] a = {
				{1,2},
				{3,4}
		};
		//		for (int[] i : a) {
		//			System.out.println(i);//it prints objects memory locations
		//		}
		for (int[] i : a) {
			for (int j : i) { //her we iterating the 1-d arrays
				System.out.println(j);

			}

		}
	}

}
