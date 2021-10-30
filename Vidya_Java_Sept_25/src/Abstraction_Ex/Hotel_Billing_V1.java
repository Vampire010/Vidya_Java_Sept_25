package Abstraction_Ex;

public abstract class Hotel_Billing_V1 
{
	//concrete methods
	public void cc_payments()
	{
		System.out.println("Payed Using Credit Card");
	}
	public void cash_payments()
	{
		System.out.println("Payed Counter Cash");
	}
	
	//abstract
	public abstract void upi_payments(String walllet_type);
	public abstract String offer_coupons();

}
