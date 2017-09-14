package Day3.com.tech;

public class Employee 
{
	private int empNo;
	private String empName;
	private int empSal;
	
	public Employee()
	{
		empNo = 6231;
		empName = "Vijay";
		empSal = 30000;
	}
	
	public Employee(int empNo, String empName, int empSal) 
	{
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpNo() 
	{
		return empNo;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public int getEmpSal() 
	{
		return empSal;
	}
}
