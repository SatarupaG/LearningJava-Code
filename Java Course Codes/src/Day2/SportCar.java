package Day2;

public class SportCar extends Car
{
	private String GearStatus;

	public void drive()
	{
		super.drive();
		GearStatus="AirBaloonType";
	}
	public void display()
	{
		super.display();
		System.out.println("Gear Status: "+GearStatus);
	}	
}
