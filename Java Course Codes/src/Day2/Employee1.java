package Day2;

public class Employee1 
{
	private int empNo;
	private String empName;
	private int empSal;
	
	public Employee1() 
	{
		empNo=6231;
		empName=" Vijay";
		empSal=30000;
	}
	
	public Employee1(int empNo, String empName, int empSal) 
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

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}

	public int getEmpSal() 
	{
		return empSal;
	}

	public void setEmpSal(int empSal) 
	{
		this.empSal = empSal;
	}
}
