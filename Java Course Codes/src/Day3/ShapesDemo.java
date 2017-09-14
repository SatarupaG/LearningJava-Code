package Day3;

import java.io.*;

import Day3.esg.itp.shapes.*;
public class ShapesDemo 
{
	public static void main(String[] args) throws IOException 
	{
		double side,length,breadth;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Side: ");
		side=Double.parseDouble(br.readLine());
		Square s=new Square(side);
		s.calcArea();
		s.calcPeri();
		s.display();
		System.out.print("Enter Length: ");
		length=Double.parseDouble(br.readLine());
		System.out.print("Enter Breadth: ");
		breadth=Double.parseDouble(br.readLine());
		Day3.esg.itp.shapes.Rectangle r=new Day3.esg.itp.shapes.Rectangle(length,breadth);
		r.calcArea();
		r.calcPeri();
		r.display();
	}
}
