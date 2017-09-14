package Day6;

import java.io.*;

public class WriteEmployee 
{
	public static void main(String[] args) throws IOException 
	{	
		int empno, empbasic;
		String empname;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		System.out.print("Enter Employee No.: ");
		empno = Integer.parseInt(bf.readLine());
		System.out.print("Enter Employee Name: ");
		empname = bf.readLine();
		System.out.print("Enter Basic Pay: ");
		empbasic = Integer.parseInt(bf.readLine());
		Employee emp = new Employee(empno, empname, empbasic);
		File empFile = new File("D:\\emp.txt");
		try
		{
			fw = new FileWriter(empFile);
			bw = new BufferedWriter(fw);
			bw.write("Employee No: " + emp.getEmpNo() + "; ");
			bw.write("Employee Name: " + emp.getEmpName() + "; ");
			bw.write("Basic Salary: " + emp.getEmpBasic());
			System.out.println("File Write Successful...");
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
		finally
		{
			try {
				bw.close();
				fw.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		try
		{
			fr = new FileReader("D:\\emp.txt");
			br = new BufferedReader(fr);
			String data = br.readLine();
			System.out.println(data);
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
		finally
		{
			try {
				br.close();
				fr.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
