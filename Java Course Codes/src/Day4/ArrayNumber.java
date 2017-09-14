package Day4;

import java.io.*;

public class ArrayNumber 
{
	private int number[]=new int[7];
	private int avg;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void setElements() throws IOException
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Number: ");
			number[i]=Integer.parseInt(br.readLine());
		}
	}
	
	public void printElements()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Number: "+number[i]);
		}
	}
	
	public void calculateSum()
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum = sum+number[i];
		}
		number[5]=sum;
		number[6]=5;
		//number[6]=0;
	}
	
	public void printAverage ()throws ArithmeticException
	{ 
		try
		{
			computeAverage();
			System.out.println("Average: "+avg);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			throw new ArithmeticException("Going back to the main method...");
		}
	}

	public void computeAverage()throws ArithmeticException  
	{
		try
		{
			avg=number[5]/number[6];	
		}catch(ArithmeticException e)
		{
			throw new ArithmeticException("Going back to the printAverage() method...");
		}
		
	}
}
