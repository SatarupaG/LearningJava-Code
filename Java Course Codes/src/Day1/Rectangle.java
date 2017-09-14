package Day1;

public class Rectangle 
{
	private double length;
	private double breadth;
	private double area;
	public double getLength() 
{
		return length;
	}
	public void setLength(double length)
 {
		this.length = length;
	}
	public double getBreadth() 
{
		return breadth;
	}
	public void setBreadth(double breadth) 
{
		this.breadth = breadth;
	}
	
	public double calArea()
	{
		area=length*breadth;
		return area;
	}
}
