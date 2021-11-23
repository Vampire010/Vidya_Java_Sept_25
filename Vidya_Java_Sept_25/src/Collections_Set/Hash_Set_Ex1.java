package Collections_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_Ex1 {

	public static void main(String[] args) 
	{
		HashSet<Integer> even_num =  new HashSet<>();
		even_num.add(8);
		even_num.add(4);
		even_num.add(6);
		even_num.add(2);
		even_num.add(10);
		even_num.add(8);
		System.out.println(even_num);
		
		HashSet<String> emp_name =  new HashSet<>();
		emp_name.add("Tarun");
		emp_name.add("Balu");
		emp_name.add("Arun");
		emp_name.add("Dharshan");
		System.out.println(emp_name);

		HashSet<Character> emp_Dep =  new HashSet<>();
		emp_Dep.add('A');
		emp_Dep.add('D');
		emp_Dep.add('B');
		emp_Dep.add('Z');
		System.out.println(emp_Dep);
		
		// Calling iterator() method
		Iterator<Character> iterate = emp_Dep.iterator();
		System.out.print("HashSet using Iterator: ");
		
		// Accessing elements
		while(iterate.hasNext()) 
		{
			System.out.print(iterate.next());
			
			System.out.print(", ");
		}
		

	}

}
