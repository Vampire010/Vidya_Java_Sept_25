package Exception_Ex;

public class Ex_5 {

	public static void main(String[] args) 
	{
		try
		{
			int[] arr = {100, 120,150,10};
			System.out.println(arr[3]);
			
			int a = 10/0;
			System.out.println(a);
		}
		catch(ArithmeticException E)
		{
			System.out.println("ArithmeticException Occured");
		}
		catch(ArrayIndexOutOfBoundsException E)
		{
			System.out.println("ArrayIndexOutOfBoundsException Occured");
		}

	}

}
