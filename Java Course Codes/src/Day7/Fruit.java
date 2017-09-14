package Day7;

public class Fruit 
{
	public String names[];

	public Fruit(String[] names) 
	{
		super();
		this.names = names;
	}

	public Fruit() 
	{
		super();
		names = new String[5];
		names[0] = "Apple";
		names[1] = "Mango";
		names[2] = "Pineapple";
		names[3] = "Papaya";
		names[4] = "Orange";
	}

	public String[] getNames() 
	{
		return names;
	}

	public void setNames(String[] names) 
	{
		this.names = names;
	}
}
