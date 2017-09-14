package Day3.esg.itp.shapes;

public class Square implements Polygon 
{
	private double side;
	private double area;
	private double perimeter;

	public Square(double side) 
	{
		this.side = side;
	}

	public void calcArea() 
	{
		area=side*side;
	}

	public void calcPeri() 
	{
		perimeter=4*side;
	}

	public void display() 
	{
		System.out.println("Area:"+area);
		System.out.println("Perimeter: "+perimeter);
	}
}


