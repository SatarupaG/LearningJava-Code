package Day1;

import java.io.*;

public class EmployeeData 
{
	public static void main(String[] args) throws IOException 
	{
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Employee[] e=new Employee[5];
		for(i=0;i<5;i++)
		{
			e[i]=new Employee();
		}
		for(i=0;i<5;i++)
		{
			System.out.print("Enter Employee No.: ");
			e[i].setEmpNo(Integer.parseInt(br.readLine()));
			System.out.print("Enter Employee Name: ");
			e[i].setEmpName(br.readLine());
			System.out.print("Enter Employee Salary: ");
			e[i].setEmpSal(Integer.parseInt(br.readLine()));			
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Employee No of Employee["+i+"] is : "+e[i].getEmpNo());
			System.out.println("Employee Name of Employee["+i+"] is : "+e[i].getEmpName());
			System.out.println("Employee Salary of Employee["+i+"] is : "+e[i].getEmpSal());					
		}		
	}
}

