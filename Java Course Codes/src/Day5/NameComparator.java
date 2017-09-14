package Day5;

import java.util.*;

public class NameComparator implements Comparator<Object>
{
	public int compare(Object st1, Object st2) 
	{
		Student4 s1=(Student4)st1;  
		Student4 s2=(Student4)st2;
		
		return s1.name.compareTo(s2.name);
		  
	}
}

