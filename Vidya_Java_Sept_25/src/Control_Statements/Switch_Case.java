package Control_Statements;

public class Switch_Case {

	public static void main(String[] args) 
	{

		int day_num = 2 ; 
				String day_Name = null;
				
				switch(day_num)
				{
				case 1:
					day_Name = "Sunday";
					break;
					
				case 2:
					day_Name = "Monday";
					break;

				case 3:
					System.out.println("Tuesday");
					break;

				case 4:
					System.out.println("Wednesday");
					break;

				case 5:
					System.out.println("Thursday");
					break;

				case 6:
					System.out.println("Friday");
					break;

				case 7:
					System.out.println("Saturday");
					break;

				
				default:
					System.out.println("Invalid Input");
					break;


				
				}
				
				System.out.println("Day is " + day_Name );

	}

}
