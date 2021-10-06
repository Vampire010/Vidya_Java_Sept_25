package Polymorphism_Ex;

public class Facebook_V2 extends Facebook
{
	//method overriding - runtime polymorphism
    @Override
	public void Facebook(int a)
	{
		System.out.println("Fb_V2_new");
	}
	
	public static void main(String[] args)
	{
		Facebook_V2 fb2 = new Facebook_V2();
		fb2.Facebook(100);
	}

}
