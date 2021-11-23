package Collections_Set;

import java.util.HashSet;

public class HasSet_Intersection_Ex1 {

	public static void main(String[] args) 
	{
		HashSet<String> emp_name_lst_1 =  new HashSet<>();
		//emp_name_lst_1.add("Tarun");
	//	emp_name_lst_1.add("Balu");
		emp_name_lst_1.add("Arun");
		emp_name_lst_1.add("Dharshan");
		System.out.println(emp_name_lst_1);

		HashSet<String> emp_name_lst_2 =  new HashSet<>();
		emp_name_lst_2.add("Arun");
		emp_name_lst_2.add("Dharshan");
	//	emp_name_lst_2.add("Krishna");
	//	emp_name_lst_2.add("Girish");
		
		//Intersection Operation
	//	emp_name_lst_2.retainAll(emp_name_lst_1);
		System.out.println(emp_name_lst_2);
		
		//Intersection Operation
	//			emp_name_lst_2.removeAll(emp_name_lst_1);
				System.out.println(emp_name_lst_2);
				
				// Check if primeNumbers is a subset of numbers
				boolean result = emp_name_lst_2.containsAll(emp_name_lst_1);
				System.out.println("Is HashSet2 is subset of HashSet1? " + result);		
		
	}

}
