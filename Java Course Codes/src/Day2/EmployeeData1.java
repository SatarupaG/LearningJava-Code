package Day2;

import java.io.*;

public class EmployeeData1 
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a;
		String b;
		int c;
		Employee1 e=new Employee1();
		System.out.println("Employee No. is : "+e.getEmpNo());
		System.out.println("Employee Name is : "+e.getEmpName());
		System.out.println("Employee Salary is : "+e.getEmpSal());

		Employee e2[]=new Employee[2];
		
		int i;
		for(i=0;i<2;i++)
		{
			System.out.print("Enter Employee No. : ");
			a=Integer.parseInt(br.readLine());
			System.out.print("Enter Employee Name : ");
			b=br.readLine();
			System.out.print("Enter Employee Salary : ");
			c=Integer.parseInt(br.readLine());
			e2[i]=new Employee(a,b,c);
			
		}
		for(i=0;i<2;i++)
		{
			System.out.println("Employee No. is : "+e2[i].getEmpNo());
			System.out.println("Employee Name is : "+e2[i].getEmpName());
			System.out.println("Employee Salary is : "+e2[i].getEmpSal());
		}
	}
}
