package Day4;

public class Average 
{	
	public static void printAverage (int totalSum, int totalNumber)
	{ 
		try
		{
			System.out.println("Average: "+computeAverage(totalSum,totalNumber));
		}catch(ArithmeticException e)
		{
			System.out.println("You cannot divide by 0");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I will execute at all times....");
		}
	}

	public static int computeAverage(int totalSum, int totalNumber) 
	{
		return totalSum/totalNumber;	
	}
}
