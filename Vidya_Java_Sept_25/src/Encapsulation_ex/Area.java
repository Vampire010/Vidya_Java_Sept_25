package Encapsulation_ex;

public class Area 
{
	
	// fields to calculate area
	  int length;
	  int breadth;

	  public Area(int length, int breadth) 
	  {
		  this.length = length;
		  this.breadth = breadth;	
	  }

	// method to calculate area
	  public void getArea() 
	  {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }


}
