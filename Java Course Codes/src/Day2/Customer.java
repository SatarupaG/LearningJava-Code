package Day2;

public class Customer 
{
	private int custNo;
	private String custName;
	private static int custCount;

	static
	{
		custCount=0;
	}

	public Customer(int custNo, String custName)
	{
		this.custNo = custNo;
		this.custName = custName;
		custCount++;
	}

	public int getCustNo() 
	{
		return custNo;
	}

	public String getCustName() 
	{
		return custName;
	}
	
	public static int getCustCount() 
	{
		return custCount;
	}
}
