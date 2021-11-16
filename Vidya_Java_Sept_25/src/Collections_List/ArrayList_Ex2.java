package Collections_List;

import java.util.ArrayList;

public class ArrayList_Ex2 
{

	public static void main(String[] args) 
	{
		// Create Array_List
		ArrayList<Integer> Emp_ID = new ArrayList<>(); 
		
		//add elements
		Emp_ID.add(1102);
		Emp_ID.add(1103);
		Emp_ID.add(1103);
		Emp_ID.add(1104);
		Emp_ID.add(1103);
		
		
		
		
		//creation of Array_List
		ArrayList<String> emp_name = new ArrayList<>(); 
				
		//add elements to Array_List
		emp_name.add("John");
		emp_name.add("nick");
		emp_name.add("den");
		emp_name.add("trump");
		
		
		ArrayList emp_data = new ArrayList<>(); 
		emp_data.addAll(Emp_ID);
		emp_data.addAll(emp_name);
		System.out.println(emp_data);

		
	}

}
