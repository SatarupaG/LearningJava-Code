package Day5;

public class Student5 implements Comparable<Object>
{
	private int rollNo;
	private String name;
	
	public Student5(int rollNo, String name) 
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

	
	public boolean equals(Object obj2) 
	{
		Student5 st=(Student5) obj2;
		if(Integer.compare(rollNo, st.rollNo) == 0 && compareTo(obj2)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int compareTo(Object obj2) 
	{
		Student5 std=(Student5) obj2;
		return name.compareTo(std.name);
	}
}
