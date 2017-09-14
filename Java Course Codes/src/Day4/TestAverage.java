package Day4;

import java.io.*;

public class TestAverage 
{
	public static void main(String[] args) throws IOException 
	{
		int TotalSum,TotalNumber;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Total Sum: ");
		TotalSum = Integer.parseInt(br.readLine());
		System.out.print("Enter Total Number: ");
		TotalNumber=Integer.parseInt(br.readLine());
		Average.printAverage(TotalSum, TotalNumber);
	}

}

