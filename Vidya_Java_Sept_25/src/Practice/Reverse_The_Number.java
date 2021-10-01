package Practice;

public class Reverse_The_Number {

	public static void main(String[] args) {
		int num = 15;
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			System.out.println("Remainder  is : " + rem);

			rev = rev*10+rem;
			
			num/=10;
		}
		System.out.println("Reversed Number is : " + rev);
		
	}

}
