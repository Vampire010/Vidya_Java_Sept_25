package Exception_Ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex_3 
{
	public static void findFile() throws FileNotFoundException, InterruptedException 
	{
		// code that may produce IOException
		File newFile=new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);
		Thread.sleep(4000);
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	{
		// TODO Auto-generated method stub
		findFile();
	}

}
