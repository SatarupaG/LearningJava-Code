package Day5;

import java.io.*;
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) throws IOException
	{
		String name;
		ArrayList<StringTokenizer> names=new ArrayList<StringTokenizer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=1;i<=2;i++)
		{
			System.out.print("Enter name: ");
			name=br.readLine();
			StringTokenizer st=new StringTokenizer(name,",");
			names.add(st);
		}
			
		Iterator<StringTokenizer> itr=names.iterator();
		{
			int count=0;
			while(itr.hasNext())
			{
				StringTokenizer temp = itr.next();
				count=count+temp.countTokens();
				while(temp.hasMoreTokens())
				{
					System.out.println("Tokens: "+ temp.nextToken());
				}
			}
			System.out.println("The total number of tokens: "+count);
		}
	}
}
