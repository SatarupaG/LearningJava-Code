package Day3;

public class CircleDemo implements GeometryConstant, GeometryMethod 
{

	public double calArea(double radius) 
	{
		return PI*radius*radius;
	}

	public double calCircumference(double radius) 
	{
		return 2*PI*radius;
	}
}

