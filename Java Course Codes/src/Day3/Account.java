package Day3;

public class Account implements AccountInter 
{
	private int accNo;
	private String name;
	private double accBal;

	public int getAccNo() 
	{
		return accNo;
	}

	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getAccBal() 
	{
		return accBal;
	}

	public void setAccBal(double accBal) 
	{
		this.accBal = accBal;
	}

	public void create(int accNo, String name, double accBal) 
	{
		setAccNo(accNo);
		setName(name); 
		setAccBal(accBal);
	}

	public double delete(int accNo) 
	{
		this.name="";
		this.accBal=0.00;
		return 1;
	}

	public void print(int accNo) 
	{
		System.out.println("Account No: "+this.accNo);
		System.out.println("Account Name: "+name);
		System.out.println("Account Balance: "+accBal);
		
	}
}
