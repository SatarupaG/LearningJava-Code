package Day5;

import java.io.*;

public class TestHashMap 
{
	public static void main(String[] args) throws IOException 
	{
		Employee emp=new Employee();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many employees you want to enter? : ");
		int num=Integer.parseInt(br.readLine());
		emp.setNames(num);
		System.out.println("The number of employees in the list...");
		emp.printNames();
		System.out.print("Enter Employee No. of the Employee you want to search? : ");
		String empNo=br.readLine();
		emp.getName(empNo);
		System.out.println("The number of employees in the list...");
		emp.printNamesKeySet();
		emp.printSize();
		System.out.print("Enter Employee No. of the Employee you want to delete? : ");
		String empNo1=br.readLine();
		emp.remove(empNo1);
		
		System.out.print("Enter Employee No. of the Employee you want to search? : ");
		String empNo2=br.readLine();
		emp.getName(empNo2);
	}

}
