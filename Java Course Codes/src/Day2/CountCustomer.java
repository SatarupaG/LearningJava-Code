package Day2;

import java.io.*;

public class CountCustomer 
{
	public static void main(String[] args) throws IOException 
	{
		int custNo;
		String custName;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Initial Customer Count: "+ Customer.getCustCount());
		Customer[] c=new Customer[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Customer No.: ");
			custNo=Integer.parseInt(br.readLine());
			System.out.println("Enter Customer Name: ");
			custName=br.readLine();
			c[i]=new Customer(custNo,custName);
			System.out.println("Updated Customer Count: "+ Customer.getCustCount());
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Customer No.: "+c[i].getCustNo());
			System.out.println("Enter Customer Name: "+c[i].getCustName());
		}	
	}
}
