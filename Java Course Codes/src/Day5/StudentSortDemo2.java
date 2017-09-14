package Day5;

import java.util.*;

public class StudentSortDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Student4> student=new ArrayList<Student4>();
		student.add(new Student4(101,"Vijay"));  
		student.add(new Student4(106,"Ajay"));  
		student.add(new Student4(105,"Jai"));
		student.add(new Student4(102,"Rajiv"));  
		student.add(new Student4(110,"Mohit"));
		
		Iterator<Student4> itr=student.iterator();  
		while(itr.hasNext())
		{  
			Student4 st=(Student4)itr.next();  
			System.out.println("Student Rollno: "+st.getRollNo()+" Student Name: "+st.getName());  
		}
		
		Collections.sort(student,new NameComparator());
		
		System.out.println("The sorted list(based on name): ");
		
		Iterator<Student4> itr1=student.iterator();  
		while(itr1.hasNext())
		{  
			Student4 st=(Student4)itr1.next();  
			System.out.println("Student Rollno: "+st.getRollNo()+" Student Name: "+st.getName());  
		}
		
	}
}
