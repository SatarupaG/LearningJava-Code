package Day1;

public class Factorial 
{
	private int number;
	private int fact;

	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number) 
	{
		this.number = number;
	}
	public int getFact() 
	{
		return fact;
	}

	public void calFact()
	{
		 fact=1;
		 int i;
		for(i=1;i<=number;i++)
			{
			   fact=fact*i;
			}
	}
}
