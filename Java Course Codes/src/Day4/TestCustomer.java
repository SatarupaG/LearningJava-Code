package Day4;

import java.io.*;

public class TestCustomer 
{
	public static void main(String[] args) throws IOException, InvalidPhoneException, InvalidCustNoException 
	{
		int custNo;
		String custName;
		String custPhone;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Customer No.: ");
		custNo=Integer.parseInt(br.readLine());
		System.out.print("Enter Customer Name: ");
		custName=br.readLine();
		System.out.print("Enter Customer Phone No.: ");
		custPhone=br.readLine();
		Customer cust=new Customer(custNo,custName,custPhone);
		System.out.print("Customer No.: "+cust.getCustNo());
		System.out.print("ECustomer Name: "+cust.getCustName());
		System.out.print("Customer Phone No.: "+cust.getCustPhone());
	}

}

