package Arrays_Ex;

public class Sngle_Dimen_Array_ex2 {

	public static void main(String[] args)
	{
		
		int odd_num[] = {3 , 5 , 7 , 9 , 11};

		char vowels[] = {'a','e','i','o','u'};
		
		System.out.println(odd_num[4]);

		
		for(int num : odd_num)
		{
			System.out.print(num + ", ");

		}
		System.out.println();

		System.out.println("********************************");

		System.out.println(vowels[2]);

		for(char alphabet : vowels)
		{
			System.out.print(alphabet + ", ");
		}
		
	}

}
