package Collections;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack();
		/* Stacks implements the Lits class, 
		 * Extends Vector class
		 * works on LIFO 
		 */
		
		//to add elements in stack we call it as push
		
		stack.push("Cycle");
		stack.push("Bike");
		stack.push("Car");
		System.out.println("before :"+stack);
		
		//to remove element we use pop()
//		stack.pop();
		
		//to look/find element we use peek, it not removes ELEMENT
		
//		System.out.println(stack.peek()); 
		
		//to search any element we use search, where is searches from to top to bottom, value of top is 1 and follow all
		
		System.out.println(stack.search("Bike"));
		
		System.out.println("After :"+stack);
		
	}

}
