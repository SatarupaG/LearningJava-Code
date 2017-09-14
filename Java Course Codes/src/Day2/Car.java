package Day2;

public class Car 
{
	private int speed;
	private int noOfGear;
	
	public void drive()
	{
		speed = 47;
		noOfGear = 5;
	}
	public void display()
	{
		System.out.println("Speed: "+speed);
		System.out.println("No of Gears: "+noOfGear);
	}
}
