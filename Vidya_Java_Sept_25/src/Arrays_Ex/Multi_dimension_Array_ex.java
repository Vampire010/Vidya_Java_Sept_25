package Arrays_Ex;

public class Multi_dimension_Array_ex {

	public static void main(String[] args) 
	{

		int[][] numbers = {
								{2  , 4  , 6  , 8},
								{1  , 3  , 5  , 7},
								{10 , 12 , 14 , 16},

						  };
		
		System.out.println(numbers[2][3]);
		System.out.println(" ************************ ");

		
		for(int i =0 ; i<numbers.length;i++)
		{
			for(int j =0 ;j<=numbers.length;j++)
			{
				System.out.print(numbers[i][j] + " ");

			}
			System.out.println();
		}
		
		
	}

}
