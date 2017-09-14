package Day1;

import java.io.*;

public class StudentData 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Student s[]=new Student[5];
		for(int i=0;i<5;i++)
		{
			s[i]=new Student();
			System.out.print("Enter the Roll No.: ");
			s[i].setRollNo(Integer.parseInt(br.readLine()));
			System.out.print("Enter the Name: ");
			s[i].setStudName(br.readLine());
			System.out.print("Enter the Percentage: ");
			s[i].setRollNo(Integer.parseInt(br.readLine()));
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Roll No.: "+s[i].getRollNo());
			System.out.println("Enter the Name: "+s[i].getStudName());
			System.out.println("Enter the Percentage: "+s[i].getPercentage());
		}		
	}
}

