package Day2;

public class Employee 
{
	private int empNo;
	private String empName;
	private int empSal;
	
	public Employee() 
	{
		empNo=123;
		empName="Manjiri";
		empSal=25000;
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
	public void setEmpNo(int empNo) 
	{
		this.empNo = empNo;
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
