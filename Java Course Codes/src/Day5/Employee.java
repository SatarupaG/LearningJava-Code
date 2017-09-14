package Day5;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Employee 
{
	private HashMap<String, String> empNames=new HashMap<String, String>();
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void setNames(int num) throws IOException
	{
		for(int i=0;i<num;i++)
		{
			System.out.print("Enter Employee No: ");
			String empNo=br.readLine();
			System.out.print("Enter Employee Name: ");
			String empName=br.readLine();
			empNames.put(empNo,empName);
		}
	}
	
	public void printNames()
	{
		Set<Entry<String, String>> s=empNames.entrySet();
		Iterator<Entry<String, String>> itr=s.iterator();
		while(itr.hasNext())
		{
			Entry<String, String> temp=itr.next();
			System.out.println("Employee No.: "+temp.getKey()+ " Employee Name: "+temp.getValue());
		}
	}
	
	
	public void getName(String key)
	{
		 boolean blnExists = empNames.containsKey(key);
		 if(blnExists==true)
		 {
			 System.out.println("Employee Name: "+empNames.get(key));
		 }
	}
	
	public void printNamesKeySet()
	{
		Set<String> s=empNames.keySet();
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println("Employee Name: "+empNames.get(itr.next()));
		}
	}
	
	public void printSize()
	{
		System.out.println("The size of HashMap = "+empNames.size()); 
	}
	
	public void remove(String key)
	{
		boolean blnExists = empNames.containsKey(key);
		 if(blnExists==true)
		 {
			 empNames.put(key, "Employee Name [Deleted]");
			 System.out.println("The Employee Name is deleted successfully....");
		 }
	}

}

