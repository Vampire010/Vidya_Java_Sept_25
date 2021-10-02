package Arrays_Ex;

public class Sngle_Dimen_Array_ex3 {

	public static void main(String[] args) 
	{
		String city_names[] = {"Chennai" , "Bangalore" , "Hyd" , "Mum" , "Delhi"};
		
		System.out.println(city_names[1]);
		System.out.println("*****************************");

		
		for(String Cities : city_names)
		{
			System.out.println(Cities);
		}
		
		System.out.println("*************Metro Cities********************");

		String Metro_Cities[] = city_names;
		System.out.println(Metro_Cities[1]);

		
	}

}
