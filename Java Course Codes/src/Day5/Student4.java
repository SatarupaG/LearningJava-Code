package Day5;

public class Student4
{
	private int rollNo;
	String name;
	
	public Student4(int rollNo, String name) 
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() 
	{
		return rollNo;
	}

	public String getName() 
	{
		return name;
	}

	public String toString() 
	{
		return "rollNo=" + rollNo + ", name=" + name + "]";
	}

}
