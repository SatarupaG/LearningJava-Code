package Day5;

import java.io.*;

public class EqualsDemo {

	public static void main(String[] args) throws IOException 
	{
		int rollno;
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Roll no.: ");
		rollno=Integer.parseInt(br.readLine());
		System.out.print("Enter Name: ");
		name=br.readLine();
		Student5 st1=new Student5(rollno,name);
		System.out.print("Enter Roll no.: ");
		rollno=Integer.parseInt(br.readLine());
		System.out.print("Enter Name: ");
		name=br.readLine();
		Student5 st2=new Student5(rollno,name);
	
		if(st1.equals(st2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");	
		}
		
	}

}
