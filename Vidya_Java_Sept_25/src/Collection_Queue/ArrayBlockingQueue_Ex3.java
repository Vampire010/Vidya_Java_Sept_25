package Collection_Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_Ex3 {

	public static void main(String[] args)
	{
		ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
		try 
		{
			// Add elements to animals
			animals.put("Cat");
			animals.add("Horse");
			animals.add("Dog");
			animals.add("Lion");

			System.out.println("ArrayBlockingQueue: " + animals);
			
			// Remove an element
			String element = animals.take();
			System.out.println("Removed Element: " + element);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
