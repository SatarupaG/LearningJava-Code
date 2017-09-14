package Day2;

import java.io.*;

public class EmployeeData 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int empNo;
		String empName;
		int empSal;
		Employee e=new Employee();
		System.out.println("Employee Name is : "+e.getEmpName());
		System.out.println("Employee Salary is : "+e.getEmpSal());
		System.out.println("Employee No. is : "+e.getEmpNo());

		System.out.print("Enter Employee No. : ");
		empNo=Integer.parseInt(br.readLine());
		System.out.print("Enter Employee Name : ");
		empName=br.readLine();
		System.out.print("Enter Employee Salary : ");
		empSal=Integer.parseInt(br.readLine());
		e=new Employee(empNo,empName,empSal);
		
		System.out.println("Employee No. is : "+e.getEmpNo());	
		System.out.println("Employee Name is : "+e.getEmpName());
		System.out.println("Employee Salary is : "+e.getEmpSal());	
	}
}
