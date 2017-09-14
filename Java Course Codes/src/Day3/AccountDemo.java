package Day3;

import java.io.*;

public class AccountDemo 
{
	public static void main(String[] args) throws IOException 
	{
		int accNo;
		String name;
		double accBal;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Account[] account=new Account[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Account No: ");
			accNo=Integer.parseInt(br.readLine());
			System.out.print("Enter Employee Name: ");
			name=br.readLine();
			System.out.print("Enter Employee Salary: ");
			accBal=Integer.parseInt(br.readLine());
			account[i]=new Account();
			account[i].create(accNo, name, accBal);
		}
		System.out.print("Enter Account No to print details: ");
		accNo=Integer.parseInt(br.readLine());
		for(int i=0;i<5;i++)
		{
			if(account[i].getAccNo()==accNo)
			{
				account[i].print(accNo);
			}
		}
		System.out.print("Enter Account No to delete details: ");
		accNo=Integer.parseInt(br.readLine());
		for(int i=0;i<5;i++)
		{
			if(account[i].getAccNo()==accNo)
			{
				int status=(int) account[i].delete(accNo);
				if(status==1)
				{
					System.out.println("Account successfully deleted");
				}
			}
		}		
	}
}
