package Day1;

public class Prime 
{
	private int number;
	private boolean check;

	public int getNumber() 
{
		return number;
	}
	public void setNumber(int number) 
	{
		this.number = number;
	}
	public boolean isCheck() 
	{
		return check;
	}

	public void checkPrime( ) 
	{
	   int s=0,i;
	   for(i=2;i<number;i++)
	   {
		  if(number%i==0)
			  s++;
	   }
	   if(s==0)
		   check=true;
	   else
		   check=false;
	}
}
