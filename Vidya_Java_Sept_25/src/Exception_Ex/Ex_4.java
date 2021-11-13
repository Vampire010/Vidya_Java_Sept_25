package Exception_Ex;

import java.io.IOException;

public class Ex_4 
{

	public static void findFile() throws IOException 
	{
		throw new IOException("Girish File not found");
	}

	public static void main(String[] args) throws IOException 
	{
		findFile();
	}

}
