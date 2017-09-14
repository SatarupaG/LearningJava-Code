package Day2;

public class Saving extends Account 
{
	private double rateOfInt ;
	
	public Saving(int accNo, String accName, double accBal, double rateOfInt) 
	{	
		super(accNo, accName, accBal);	
	}
	
	public Saving() 
	{	
		setAccNo(12345);
		setAccName("Ritesh");
		setAccBal(85000.0);
		setRateOfInt(12.5);
	}

	public double getRateOfInt() 
	{
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) 
	{
		this.rateOfInt = rateOfInt;
	}
}
