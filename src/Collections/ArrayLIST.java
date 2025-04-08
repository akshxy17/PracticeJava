package Collections;

import java.util.ArrayList;

public class ArrayLIST {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(1);
		a.addFirst(0);//adds element at 0 index
		a.addLast(9);//adds element at last index

//		System.out.println(a);
		///////////////////////////////////
		ArrayList<Integer> b = new ArrayList<>();
		
		b.add(1);
		b.add(4);
		b.add(3);
		System.out.println(a.addAll(b));
		System.out.println(a);
//		
//		//lets remove 0 from a vector
//		
		a.remove(0);
		System.out.println("first element is removed" + a);
//		
//		//lets retrive any element from updated list
//		
		System.out.println(a.get(2));
		
		//lets update any element
		
		a.set(0, 11);
		System.out.println(a);
		
		
		

		

	}

}
