package Day3.com.tech.geometry;

import Day3.geometry.shapes.*;
import java.io.*;

public class TestLine 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Line l=new Line();
		Point p1=new Point();
		Point p2=new Point();
		System.out.print("Enter x of Point1: ");
		p1.setX(Integer.parseInt(br.readLine()));
		System.out.print("Enter y of Point1: ");
		p1.setY(Integer.parseInt(br.readLine()));
		System.out.print("Enter x of Point2: ");
		p2.setX(Integer.parseInt(br.readLine()));
		System.out.print("Enter y of Point2: ");
		p2.setY(Integer.parseInt(br.readLine()));
		l.setPoint1(p1);
		l.setPoint2(p2);
		l.draw();
		l.scale();
		System.out.println("X of Point1= "+l.getPoint1().getX());
		System.out.println("Y of Point1= "+l.getPoint1().getY());
		System.out.println("X of Point2= "+l.getPoint2().getX());
		System.out.println("Y of Point2= "+l.getPoint2().getY());
	}
}
