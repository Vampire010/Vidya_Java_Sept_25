package Collections_Set;

import java.util.TreeSet;

public class TreSet_Ex6 {

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
		// Using higher()
		System.out.println("Using higher: " + numbers.higher(8));
		
		// Using lower()
		System.out.println("Using lower: " + numbers.lower(8));
		// Using ceiling()
		System.out.println("Using ceiling: " + numbers.ceiling(6));
		// Using floor()
		System.out.println("Using floor: " + numbers.floor(8));
		
		// Using pollFirst()
		System.out.println("Removed First Element: " + numbers.pollFirst());
		// Using pollLast()
		System.out.println("Removed Last Element: " + numbers.pollLast());
		System.out.println("New TreeSet: " + numbers);
	}

}
