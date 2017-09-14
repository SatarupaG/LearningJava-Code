package Day2;

import java.io.*;

public class TestAccount 
{
	public static void main(String[] args) throws IOException
	{
		int accNo;
		String accName;
		double accBal;
		double rateOfInt;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Saving saving = new Saving();
		Current current = new Current();
		
		System.out.println("Savings Account Details: ");
		System.out.println("Account No. : "+saving.getAccNo());
		System.out.println("Account Holder : "+saving.getAccName());
		System.out.println("Account Balance : "+saving.getAccBal());
		System.out.println("Rate Of Interest : "+saving.getRateOfInt());
		
		System.out.println("\n\nCurrent Account Details: ");
		System.out.println("Account No. : "+current.getAccNo());
		System.out.println("Account Holder : "+current.getAccName());
		System.out.println("Account Balance : "+current.getAccBal());
		System.out.println("Rate Of Interest : "+current.getRateOfInt());
		
		System.out.print("\n\nEnter Savings Account Details: ");
		System.out.print("Enter Account No.: ");
		accNo = Integer.parseInt(br.readLine());
		System.out.print("Enter Account Holder Name: ");
		accName = br.readLine();
		System.out.print("Enter Account Balance: ");
		accBal = Double.parseDouble(br.readLine());
		System.out.print("Enter Rate of Interest: ");
		rateOfInt = Double.parseDouble(br.readLine());
		Saving saving1 = new Saving(accNo, accName, accBal, rateOfInt);
		
		System.out.print("\n\nEnter Current Account Details: ");
		System.out.print("Enter Account No.: ");
		accNo = Integer.parseInt(br.readLine());
		System.out.print("Enter Account Holder Name: ");
		accName = br.readLine();
		System.out.print("Enter Account Balance: ");
		accBal = Double.parseDouble(br.readLine());
		System.out.print("Enter Rate of Interest: ");
		rateOfInt = Double.parseDouble(br.readLine());
		Current current1 = new Current(accNo, accName, accBal, rateOfInt);
		
		System.out.println("New Savings Account Details: ");
		System.out.println("Account No. : "+saving1.getAccNo());
		System.out.println("Account Holder : "+saving1.getAccName());
		System.out.println("Account Balance : "+saving1.getAccBal());
		System.out.println("Rate Of Interest : "+saving1.getRateOfInt());
		
		
		System.out.println("New Current Account Details: ");
		System.out.println("Account No. : "+current1.getAccNo());
		System.out.println("Account Holder : "+current1.getAccName());
		System.out.println("Account Balance : "+current1.getAccBal());
		System.out.println("Rate Of Interest : "+current1.getRateOfInt());
	}
}

