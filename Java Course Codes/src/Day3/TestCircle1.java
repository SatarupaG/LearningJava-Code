package Day3;

import java.util.*;

public class TestCircle1 
{
	public static void main(String[] args)
	{
		Circle1 c=new Circle1();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius=Double.parseDouble(sc.next());
		System.out.println("Area: "+c.calArea(radius));
		System.out.println("Area: "+c.calCircumference(radius));
		sc.close();
	}
}
