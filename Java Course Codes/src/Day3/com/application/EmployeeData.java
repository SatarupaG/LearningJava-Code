package Day3.com.application;

import java.io.*;
import Day3.com.tech.*;

public class EmployeeData
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Employee e1=new Employee();
		System.out.println("Employee No: "+e1.getEmpNo());
		System.out.println("Employee Name: "+e1.getEmpName());
		System.out.println("Employee Salary: "+e1.getEmpSal());
		Employee[] e2=new Employee[2];
		for(int i=0;i<2;i++)
		{
			System.out.print("Enter Employee No: ");
			int eno = Integer.parseInt(br.readLine());
			System.out.print("Enter Employee Name: ");
			String ename = br.readLine();
			System.out.print("Enter Employee Salary: ");
			int esal = Integer.parseInt(br.readLine());
			e2[i]=new Employee(eno,ename,esal);
		}
		for(int i=0;i<2;i++)
		{
			System.out.println("Employee No: "+e2[i].getEmpNo());
			System.out.println("Employee Name: "+e2[i].getEmpName());
			System.out.println("Employee Salary: "+e2[i].getEmpSal());
		}
	}
}
