package Collections_Set;

import java.util.HashSet;

public class HashSet_Union_Ex2 {

	public static void main(String[] args)
	{	
		HashSet<String> emp_name_lst_1 =  new HashSet<>();
		emp_name_lst_1.add("Tarun");
		emp_name_lst_1.add("Balu");
		emp_name_lst_1.add("Arun");
		emp_name_lst_1.add("Dharshan");
		System.out.println(emp_name_lst_1);

		HashSet<String> emp_name_lst_2 =  new HashSet<>();
		emp_name_lst_2.add("Aman");
		emp_name_lst_2.add("Rama");
		emp_name_lst_2.add("Krishna");
		emp_name_lst_2.add("Girish");
		//Union Operation
		emp_name_lst_2.addAll(emp_name_lst_1);
		
		System.out.println(emp_name_lst_2);
	}

}
