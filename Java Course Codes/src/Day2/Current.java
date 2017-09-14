package Day2;

public class Current extends Account 
{
	private double rateOfInt ;

	public double getRateOfInt() 
	{
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) 
	{
		this.rateOfInt = rateOfInt;
	}

	public Current(int accNo, String accName, double accBal, double rateOfInt) 
	{
		super(accNo, accName, accBal);
	}
	
	public Current() 
	{
		setAccNo(11456);
		setAccName("Sunil");
		setAccBal(33200.0);
		setRateOfInt(15.2);
	}
}
