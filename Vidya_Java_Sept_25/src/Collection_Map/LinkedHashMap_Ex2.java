package Collection_Map;

import java.util.LinkedHashMap;

public class LinkedHashMap_Ex2 {

	public static void main(String[] args) 
	{
		// Creating a LinkedHashMap of even numbers
		LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		System.out.println("LinkedHashMap1: " + evenNumbers);
		
		LinkedHashMap<String, Integer> oddNumbers = new LinkedHashMap<>();
		oddNumbers.put("Three", 3);
		oddNumbers.put("Five", 5);
		oddNumbers.put("Seven", 7);
		
		// Creating a LinkedHashMap from other LinkedHashMap
		LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
		numbers.putAll(oddNumbers);
		System.out.println("LinkedHashMap2: " + numbers);
		
		// Using putIfAbsent()
		numbers.putIfAbsent("Six", 6);
		System.out.println("Updated LinkedHashMap(): " + numbers);
		
		// Using get()
		int value1 = numbers.get("Three");
		System.out.println("Returned Number: " + value1);
		
		// Using getOrDefault()
		int value2 = numbers.getOrDefault("Eight", 8);
		System.out.println("Returned Number: " + value2);
		
		
	}

}
