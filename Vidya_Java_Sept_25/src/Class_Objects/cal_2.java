package Class_Objects;

public class cal_2 
{

	public void zoo()
	{
		Calculater_Exa cal = new Calculater_Exa();
		cal.take();
	}
	
	
	public static void main(String[] args) 
	{

		Calculater_Exa cal = new Calculater_Exa();
		cal.addition();
		cal.Sub();
		cal.div();
		cal.Mul();
		
		System.out.println(cal.a);
		
		cal.take();
	}

}
