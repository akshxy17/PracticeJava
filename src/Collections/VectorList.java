package Collections;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		
		v1.add("AKSHAY");
		v1.add("IS THE BEST");
		
		System.out.println(v1);
//		System.out.println("No of elements:" + v1.size());
//		System.out.println("Capacity :" + v1.capacity());
		
		Vector v2 = new Vector();
		
		v2.add("And Richest person in india");
		v2.add("Okay");
		System.out.println(v2);
		
		//LEts add these 2 vectors(v1 and v2)
		
		v1.addAll(v2);
		System.out.println(v1);
		
		//Lets retrive any element
		System.out.println(v1.get(0));
		
		//Lets delete amy element
//		System.out.println(v2.remove(1));
		
		//lets update any element
		v2.set(1, "Thanks");
		System.out.println(v2.get(1));
		

		

	}

}
