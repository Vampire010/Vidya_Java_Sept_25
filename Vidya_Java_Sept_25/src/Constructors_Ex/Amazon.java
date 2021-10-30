package Constructors_Ex;

public class Amazon 
{

	//No-Arg Constructor
	public Amazon()
	{
		System.out.println(" Amazon Pantry ");
	}
	
	//Parameterized constructor
	public Amazon(int  Electroinic)
	{
		System.out.println(" Amazon Electroinic ");
	}
	
	public Amazon(int  Electroinic , String Mobiles)
	{
		System.out.println(" Amazon Mobiles ");
	}
	
	public  void test_methode()
	{
		System.out.println(" Amazon Mobiles ");

	}
	
	
	
	public static void main(String[] args) 
	{
		Amazon Amazon_Pantry = new Amazon();
		
		Amazon Electroinic = new Amazon(12);

		Amazon Mobiles = new Amazon(12,"iPhone");

		Mobiles.test_methode();
	}

}
