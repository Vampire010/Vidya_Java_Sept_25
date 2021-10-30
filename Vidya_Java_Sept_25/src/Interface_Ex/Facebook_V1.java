package Interface_Ex;

public class Facebook_V1 implements Social_Media_Platforms_V2 ,SocialMedia_Rename
{

	public static void main(String[] args) 
	{
		Facebook_V1 v1 =  new Facebook_V1();
		v1.facebook();
		v1.facebbok();
	}

	@Override
	public void facebook() 
	{
		System.out.println(" We are changing our name of Facebook to  ");
	}

	@Override
	public void WhatsApp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Twitter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Intagram() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void facebbok() {

		System.out.println(" Facebook - " + " META " );
	}

}
