package Day2;

public class Account 
{	
	private int accNo;
	private String accName;
	private double accBal;
	
	public double getAccBal() 
	{
		return accBal;
	}

	public void setAccBal(double accBal) 
	{
		this.accBal = accBal;
	}

	public int getAccNo() 
	{
		return accNo;
	}

	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}

	public String getAccName() 
	{
		return accName;
	}

	public void setAccName(String accName) 
	{
		this.accName = accName;
	}

	public Account(int accNo, String accName, double accBal) 
	{
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	
	public Account() 
	{	
		accNo = 12345;
		accName = "";
		accBal = 0.0;
	}
}
