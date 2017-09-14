package Day1;

import java.io.*;

public class EvenOddTest 
{
	public static void main(String[] args) throws IOException
	{
		EvenOdd e=new EvenOdd();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		e.setNum(Integer.parseInt(br.readLine()));
e.checkEvenOdd();
		if(e.isEvenodd()==true)
		{
			System.out.println("The number "+e.getNum()+" is even");
		}
		else
		{
			System.out.println("The number "+e.getNum()+" is odd");
		}
	}		
}
