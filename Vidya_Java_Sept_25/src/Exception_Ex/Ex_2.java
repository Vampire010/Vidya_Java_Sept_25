package Exception_Ex;

public class Ex_2 {

	public static void main(String[] args) 
	{
		try
		{
			int a = 10/2;
			System.out.println(a);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}

		finally
		{
			System.out.println("Finally Occured");
		}
	}

}
