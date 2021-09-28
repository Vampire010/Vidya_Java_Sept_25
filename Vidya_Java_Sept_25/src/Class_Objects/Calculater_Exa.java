package Class_Objects;

public class Calculater_Exa 
{

	double a = 20;
	double b = 30;
	double result;
	
	 
	
	public void addition()
	{
		String cal_Type = "Addition";
		System.out.println(a + b);
	}

	public void Sub()
	{
		System.out.println(a - b);
		
	}
	
	public void div()
	{
		System.out.println(a / b);
		
	}
	
	public void Mul()
	{
		System.out.println(a * b);
		
	}
	
	public static void take()
	{
		System.out.println("Im Static" );
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Calculater_Exa cal = new Calculater_Exa();
		cal.addition();
		cal.Sub();
		cal.div();
		cal.Mul();
		//cal.take();

		Calculater_Exa.take();
	}

}
