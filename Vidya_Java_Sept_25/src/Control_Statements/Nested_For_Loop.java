package Control_Statements;

public class Nested_For_Loop {

	public static void main(String[] args) 
	{

		for(int i = 1 ; i<= 10 ;i++)
		{
			for(int j = 5 ; j<=i ;j++)
			{
				System.out.println(i);
				break;
			}
		}
		
	}
	
}


