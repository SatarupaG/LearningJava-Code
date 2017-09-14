package Day4;

public class Customer 
{
	private int custNo;
	private String custName;
	private String custPhone;
	
	
	public Customer(int custNo, String custName, String custPhone) throws InvalidPhoneException, InvalidCustNoException
	{
		String tempNo=String.valueOf(custNo);
		if(tempNo.length()==4)
		{
			this.custNo = custNo;
		}
		else
		{
			throw new InvalidCustNoException();
		}
		this.custName = custName;
		if(custPhone.length()==10)
		{
			this.custPhone = custPhone;
		}
		else
		{
			throw new InvalidPhoneException();
		}
		
	}
	
	public int getCustNo() 
	{
		return custNo;
	}
	public String getCustName() 
	{
		return custName;
	}
	public String getCustPhone() 
	{
		return custPhone;
	}
	
}
