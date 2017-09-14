package Day3;

import java.io.*;
public class TestEmployee 
{
	public static void main(String[] args) throws IOException 
	{
		Employee e=new Employee();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee No: ");
		e.setEmpNo(Integer.parseInt(br.readLine()));
		System.out.print("Enter Employee Name: ");
		e.setEmpName(br.readLine());
		System.out.print("Enter Employee Salary: ");
		e.setEmpBasic(Integer.parseInt(br.readLine()));
		System.out.println(e.toString());
	}

}
