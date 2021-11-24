package Collections_Set;

import java.util.TreeSet;

public class Treeset_Ex7 {

	public static void main(String[] args)
	{
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		System.out.println("TreeSet: " + numbers);
		
		// Using headSet() with default boolean value
		System.out.println("Using headSet without boolean value: " + numbers.headSet(6));
		
		// Using headSet() with specified boolean value
		System.out.println("Using headSet with boolean value: " + numbers.headSet(6, true));
		
		// Using tailSet() with default boolean value
		System.out.println("Using tailSet without boolean value: " + numbers.tailSet(4));
		
		// Using tailSet() with specified boolean value
		System.out.println("Using tailSet with boolean value: " + numbers.tailSet(4, false));
	}

}
