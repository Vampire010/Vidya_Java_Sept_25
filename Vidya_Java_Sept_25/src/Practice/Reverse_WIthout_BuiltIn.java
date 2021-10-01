package Practice;

public class Reverse_WIthout_BuiltIn {

	public static void main(String[] args) {
		
		String name =" Girish is a Automation Trainer";
		char ch[] = name.toCharArray();
		String rev ="";
		
		for(int i = ch.length-1; i>0;i--)
		{
			rev+=ch[i];
		//	System.out.println(ch[i]);

		}
		System.out.println(rev);
		
	}

}
