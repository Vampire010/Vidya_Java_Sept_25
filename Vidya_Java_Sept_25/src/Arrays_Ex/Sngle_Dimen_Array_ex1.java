package Arrays_Ex;

public class Sngle_Dimen_Array_ex1 
{

	public static void main(String[] args) 
	{
		
		int even_num[] = new int[5];
		even_num[0] = 2;
		even_num[1] = 4;
		even_num[2] = 6;
		even_num[3] = 8;
		even_num[4] = 10;
		
		System.out.println(even_num[4]);
		
		for(int i = 0 ; i<even_num.length;i++)
		{
			System.out.print(even_num[i] + " , ");

		}


		
	}

}
