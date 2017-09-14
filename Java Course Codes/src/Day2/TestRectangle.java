package Day2;

import java.io.*;

public class TestRectangle 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Rectangle r=new Rectangle();
		System.out.print("Enter Height : ");
		r.setHeight(Double.parseDouble(br.readLine()));
		System.out.print("Enter Width : ");
		r.setWidth(Double.parseDouble(br.readLine()));
		System.out.print("The area of the rectangle is : "+r.calArea());
	}
}
