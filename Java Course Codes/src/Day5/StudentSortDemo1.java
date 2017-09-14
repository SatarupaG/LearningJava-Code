package Day5;

import java.util.*;

public class StudentSortDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList<Student3> student=new ArrayList<Student3>();
		student.add(new Student3(101,"Vijay"));  
		student.add(new Student3(106,"Ajay"));  
		student.add(new Student3(105,"Jai"));
		student.add(new Student3(102,"Rajiv"));  
		student.add(new Student3(110,"Mohit"));
		
		Iterator<Student3> itr=student.iterator();  
		while(itr.hasNext())
		{  
			Student3 st=(Student3)itr.next();  
			System.out.println("Student Rollno: "+st.getRollNo()+" Student Name: "+st.getName());  
		}
		
		Collections.sort(student);
		
		System.out.println("The sorted list(based on name): ");
		
		Iterator<Student3> itr1=student.iterator();  
		while(itr1.hasNext())
		{  
			Student3 st=(Student3)itr1.next();  
			System.out.println("Student Rollno: "+st.getRollNo()+" Student Name: "+st.getName());  
		}
		
	}

}

