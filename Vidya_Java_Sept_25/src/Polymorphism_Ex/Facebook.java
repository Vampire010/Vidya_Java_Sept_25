package Polymorphism_Ex;

public class Facebook 
{
	
	//Method Overloading - CompileTime Polymorphism
	public void Facebook()
	{
		System.out.println("Fb_V1");
	}
	public void Facebook(int a)
	{
		System.out.println("Fb_V2");
	}
	public void Facebook(int a,double b)
	{
		System.out.println("Fb_V3");
	}

	public static void main(String[] args) 
	{
		Facebook fb = new Facebook();
		fb.Facebook();
		fb.Facebook(10);
		fb.Facebook(10, 12.2);

	}

}
