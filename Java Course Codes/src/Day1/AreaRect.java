package Day1;

import java.io.*;

public class AreaRect 
{
	public static void main(String[] args) throws IOException
	{
		int i=0;
		BufferedReader jk=new BufferedReader(new InputStreamReader(System.in));
		Rectangle r[]=new Rectangle[5];
		for(i=0;i<5;i++)
		{
			r[i]=new Rectangle();	
		}
		for(i=0;i<5;i++)
		{
			System.out.print("Enter length");
			r[i].setLength(Integer.parseInt(jk.readLine()));
			System.out.print("Enter breadth");
			r[i].setBreadth(Integer.parseInt(jk.readLine()));			
		}
		for(i=0;i<5;i++)
		{
			r[i].calArea();
		}
		for(i=0;i<5;i++)
		{
		    System.out.println("The area of the "+i+"Rectangle is "+r[i].calArea());
		}
	}
}

