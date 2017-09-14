package Day3.esg.itp.shapes;

public class Rectangle implements Polygon
{
	private double length;
	private double breadth;
	private double area;
	private double perimeter;

	public Rectangle(double length, double breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void calcArea() 
	{
		area=length*breadth;
	}

	public void calcPeri() 
	{
		perimeter=2*(length+breadth);
	}

	public void display() 
	{
		System.out.println("Area:"+area);
		System.out.println("Perimeter: "+perimeter);
	}
}
