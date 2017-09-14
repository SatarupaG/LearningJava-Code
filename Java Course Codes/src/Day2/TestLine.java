package Day2;

import java.io.*;

public class TestLine 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Line line = new Line();
		Point pt1 = new Point();
		Point pt2 = new Point();
		
		System.out.println("Enter the Values for Point1:: ");
		System.out.print("Enter X-Cordinate of Point1: ");
		pt1.setX(Integer.parseInt(br.readLine()));
		System.out.print("Enter Y-Cordinate of Point1: ");
		pt1.setY(Integer.parseInt(br.readLine()));
		line.setPoint1(pt1);
		
		System.out.println("Enter the Values for Point2:: ");
		System.out.print("Enter X-Cordinate of Point2: ");
		pt2.setX(Integer.parseInt(br.readLine()));
		System.out.println("Enter Y-Cordinate of Point2: ");
		pt2.setY(Integer.parseInt(br.readLine()));
		line.setPoint2(pt2);
		
		System.out.println("The Values of Point1:: ");
		System.out.println("X-Coordinate : "+line.getPoint1().getX());
		System.out.println("Y-Coordinate : "+line.getPoint1().getY());
		
		System.out.println("The Values of Point2:: ");
		System.out.println("X-Coordinate : "+line.getPoint2().getX());
		System.out.println("Y-Coordinate : "+line.getPoint2().getY());
	}
}
