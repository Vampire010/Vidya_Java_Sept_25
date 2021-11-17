package Collections_List;

import java.util.Stack;

public class Stack_Ex1 {

	public static void main(String[] args) 
	{
		Stack<Double> id = new Stack<>();
		id.push(11421.00);
		id.push(11422.00);
		id.push(11423.00);
		id.push(11424.00);
		id.push(11425.00);

		System.out.println(id);
		
		// Remove element stacks
		double element = id.pop();
		System.out.println("Removed Element: " + element);
		System.out.println(id);

		// Access element from the top
		double element1 = id.peek();
		System.out.println("Element at top: " + element1);
		
		// Search an element
		int position = id.search(11421.00);
		System.out.println("Position of 11421.00: " + position);

	}

}
