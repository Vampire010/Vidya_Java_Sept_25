package Abstraction_Ex;

public class Hotel_Billing_V2 extends Hotel_Billing_V1
{

	@Override
	public void upi_payments(String Wallet_Type) 
	{
		System.out.println("Payed Using upi_payments " + Wallet_Type);
	}

	@Override
	public String offer_coupons() 
	{
		String offer_code = "Super50";
		System.out.println("offer_coupons - " + offer_code);
		return offer_code;
	}
	
	public static void main(String[] args) 
	{
		Hotel_Billing_V2 v2 = new Hotel_Billing_V2();
		v2.cash_payments();
		v2.cc_payments();
		v2.upi_payments("Google_Pay");
		v2.offer_coupons();
		
	}


}
