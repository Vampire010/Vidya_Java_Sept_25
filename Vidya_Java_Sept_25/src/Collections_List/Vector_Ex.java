package Collections_List;

import java.util.Vector;

public class Vector_Ex {

	public static void main(String[] args) 
	{
		Vector<String> prog = new Vector<>();
		prog.add("Java");
		prog.add("C");
		prog.add("C#");
		prog.add("Python");
		prog.add("php");
		
		System.out.println(prog);
		
		for(String Programming : prog)
		{
			System.out.println(Programming);
		}
		
		System.out.println("################################################");
	
		for(int i =0 ; i<prog.size();i++)
		{
			System.out.println(prog.get(i));
		}
		
	}

}
