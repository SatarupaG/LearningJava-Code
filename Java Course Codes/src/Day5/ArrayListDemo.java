package Day5;

import java.io.*;

public class ArrayListDemo 
{
	public static void main(String[] args) throws IOException 
	{
		Student0 std=new Student0();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many student names you want to enter? : ");
		int num=Integer.parseInt(br.readLine());
		std.setNames(num);
		System.out.print("Enter name of the student you want to search? : ");
		String stuName=br.readLine();
		std.searchName(stuName);
		System.out.print("Enter index of the student you want to search? : ");
		int index=Integer.parseInt(br.readLine());
		std.searchName(index);
		System.out.println("The number of students in the list...");
		std.printNames();
		System.out.print("Enter name of the student you want to delete? : ");
		String stuName1=br.readLine();
		std.removeName(stuName1);
		System.out.println("The number of students in the list...");
		std.printNames();
	}

}
