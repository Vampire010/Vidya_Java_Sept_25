package Collections_List;

import java.util.ArrayList;

public class ArrayList_Ex4 {

	public static void main(String[] args) 
	{

		//creation of Array_List
				ArrayList<String> emp_name = new ArrayList<>(); 
				
				//add elements to Array_List
				emp_name.add("John");
				emp_name.add("nick");
				emp_name.add("Zak");
				emp_name.add("Albert");
				emp_name.add("Edwin");

				boolean emp = emp_name.isEmpty();
				System.out.println(emp);
				
				int emp1 = emp_name.indexOf("John");
				System.out.println(emp1);
				
				boolean emp2 = emp_name.contains("Edwin");
				System.out.println(emp2);
				
				
				

	}

}
