package Day6;

public class Employee 
{
	private int empNo;
	private String empName;
	private int empBasic;
	
	public int getEmpNo() 
	{
		return empNo;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public int getEmpBasic() 
	{
		return empBasic;
	}

	public Employee(int empNo, String empName, int empBasic) 
	{
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empBasic = empBasic;
	}
}
