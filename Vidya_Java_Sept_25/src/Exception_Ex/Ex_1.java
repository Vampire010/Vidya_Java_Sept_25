package Exception_Ex;

public class Ex_1 {

	public static void main(String[] args) 
	{

		int[] arr = {100,120,360,90};
		try
		{
			System.out.println(arr[4]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
		
		System.out.println(arr[3]);

		
	}

}
