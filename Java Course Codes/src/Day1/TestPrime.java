package Day1;

import java.io.*;

public class TestPrime 
{
	public static void main(String[] args) throws IOException
	{
		Prime p=new Prime();
		BufferedReader gh=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		p.setNumber(Integer.parseInt(gh.readLine()));
		p.checkPrime();
		if(p.isCheck()==true)
{
			System.out.println("The number " +p.getNumber() +" is prime");
}
		else
{
			System.out.println("The number " +p.getNumber() +" is not prime");	
}
	}
}

