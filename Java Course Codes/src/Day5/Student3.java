package Day5;

public class Student3 implements Comparable<Object> 
{
	private int rollNo;
	private String name;
	
	public Student3(int rollNo, String name) 
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
		return "rollNo=" + rollNo + ", name=" + name ;
	}

	
	public int compareTo(Object obj) 
	{
		Student3 st=(Student3) obj;
		return name.compareTo(st.name);
	}

}
