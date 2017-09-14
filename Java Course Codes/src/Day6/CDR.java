package Day6;

public class CDR 
{
	private int sourceNumber;
	private int destinationNumber;
	private double duration;
	private double charge;
	
	public CDR(int sourceNumber, int destinationNumber, double duration) 
	{
		super();
		this.sourceNumber = sourceNumber;
		this.destinationNumber = destinationNumber;
		this.duration = duration;
	}
	
	public CDR() 
	{
		super();
	}
	
	public int getSourceNumber() 
	{
		return sourceNumber;
	}

	public int getDestinationNumber() 
	{
		return destinationNumber;
	}

	public double getDuration() 
	{
		return duration;
	}

	public double getCharge() 
	{
		return charge;
	}
	
	public void calcuateCharge() 
	{
		charge = duration * 60;
		charge = charge/100;
		System.out.println("Call Charge: Rs."+charge);
	}
}

