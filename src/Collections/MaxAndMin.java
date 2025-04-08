package Collections;

import java.util.ArrayList;

public class MaxAndMin {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(2);
		a.add(4);
		a.add(3);
		System.out.println(a);
		
		int min = a.get(0);
		int max = a.get(0);
		for (Integer integer : a) {
			if (integer < min) min = integer;
		    if (integer > max) max = integer;
		}

	}

}
