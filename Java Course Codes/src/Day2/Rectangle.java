package Day2;

public class Rectangle 
{
	private double height;
	private double width;
	public Rectangle() 
	{
		height=5.0;
		width=5.0;
	}
	public Rectangle(double height, double width) 
	{
		this.height = height;
		this.width = width;
	}
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
	}
	public double calArea()
	{
		double a;
		a=height*width;
		return a;
	}
}
