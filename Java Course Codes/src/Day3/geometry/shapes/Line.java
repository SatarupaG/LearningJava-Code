package Day3.geometry.shapes;

public class Line extends Point implements Shape 
{
	private Point point1;
	private Point point2;

	public Point getPoint1() 
	{
		return point1;
	}

	public void setPoint1(Point point1) 
	{
		this.point1 = point1;
	}

	public Point getPoint2() 
	{
		return point2;
	}

	public void setPoint2(Point point2) 
	{
		this.point2 = point2;
	}

	public void draw() 
	{
		System.out.println("This is to draw");
	}

	public void scale() 
	{
		System.out.println("This is to scale");
	}
}

