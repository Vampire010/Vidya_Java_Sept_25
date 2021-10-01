package Practice;

import java.util.Scanner;

public class Odd_r_even {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println( num+ " :Number is Even");
		}
			
		else
		{
			System.out.println( num+ " :Number is odd");
		}
				
		sc.close();
	}

}
