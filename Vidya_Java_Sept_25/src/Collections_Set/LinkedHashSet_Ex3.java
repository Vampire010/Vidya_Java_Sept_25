package Collections_Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet_Ex3 {

	public static void main(String[] args) 
	{
		
		// Creating a LinkedHashSet from an ArrayList
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>(8,60);
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(10);
		numbers.add(12);
		numbers.add(14);
		numbers.add(16);
		numbers.add(18);
		numbers.add(20);
		numbers.add(22);
		numbers.add(24);
		
		System.out.println("LinkedHashSet: " + numbers);

		
		LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>();
		numbers1.add(2);
		numbers1.add(4);
		numbers1.add(6);
		numbers1.add(8);
		numbers1.add(10);
		System.out.println("LinkedHashSet: " + numbers1);

	}

}
