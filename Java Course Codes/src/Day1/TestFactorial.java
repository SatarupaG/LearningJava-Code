package Day1;

import java.io.*;

public class TestFactorial 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader hi=new BufferedReader(new InputStreamReader(System.in));
		Factorial f=new Factorial();
		System.out.println("Enter the number");
		f.setNumber(Integer.parseInt(hi.readLine()));
		f.calFact();
		System.out.println("The factorial of "+f.getNumber()+" is "+f.getFact());
	}
}
