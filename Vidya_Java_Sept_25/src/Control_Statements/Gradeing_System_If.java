package Control_Statements;

public class Gradeing_System_If {

	public static void main(String[] args) 
	{
		int Student_Percentge = 101 ;
		
		if(Student_Percentge>=85 && Student_Percentge<=100)
		{
			  System.out.println("Grade " + " A+ ");	
		}
		
		else if(Student_Percentge>=60 && Student_Percentge<85)
		{
		
			  System.out.println("Grade " + " A ");	
			
		}
		
		else if(Student_Percentge>=50 && Student_Percentge<60)
		{
			
			  System.out.println("Grade " + " B ");	
			
		}

		else if(Student_Percentge>=35 && Student_Percentge<50)
		{
			System.out.println("Grade " + " C ");	
			
		}
		
		else if(Student_Percentge <35 && Student_Percentge>0)
		{
			System.out.println(" Try Again ");	
			
		}
		
		else {
			System.out.println(" Invalid Percentage ");	

		}
		
	}

}
