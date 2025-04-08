package Arrays;

public class sanju {

	public static void main(String[] args) {
		int[][] array1 = {
	            {1, 2, 1},
	            {9, 7, 2},
	            {7, 6, 9}
	        };

	        int[][] array2 = {
	            {2, 6, 8, 6},
	            {0, 1, 3, 9, 7},
	            {7, 2, 0},
	            {8, 3}
	        };

	        for (int i = 0; i < array1.length; i++) {
	            for (int j = 0; j < array1[i].length; j++) {
	                int currentElement = array1[i][j];

	                boolean alreadyPrinted = false;

	                for (int k = 0; k < i; k++) {
	                    for (int l = 0; l < array1[k].length; l++) {
	                        if (array1[k][l] == currentElement) {
	                            alreadyPrinted = true;
	                            break;
	                        }
	                    }
	                    if (alreadyPrinted) break;
	                }

	                if (!alreadyPrinted) {
	                    for (int k = 0; k < array2.length; k++) {
	                        for (int l = 0; l < array2[k].length; l++) {
	                            if (currentElement == array2[k][l]) {
	                                System.out.print(currentElement + " ");
	                                alreadyPrinted = true;  
	                                break;
	                            }
	                        }
	                        if (alreadyPrinted) break;  
	                    }
	                }
	            }
	        }

	}

}
