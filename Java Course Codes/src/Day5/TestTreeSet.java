package Day5;

import java.io.*;
import java.util.*;

public class TestTreeSet 
{
	public static void main(String[] args) throws IOException
	{
		int i;
		String remProd;
		TreeSet<String> product = new TreeSet<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("How many product names you want to enter: ");
		i = Integer.parseInt(br.readLine());
		for(int j=0;j<i;j++)
		{
			System.out.print("Enter product name: ");
			product.add(br.readLine());
		}
		
		Iterator<String> itr=product.iterator();
		while(itr.hasNext())
		{
			System.out.println("Product: "+itr.next());
		}
		
		System.out.println("First product in the list: "+product.first());
		System.out.println("Last product in the list: "+product.last());
		
		System.out.println("Size of TreeSet list: "+product.size());
		
		System.out.print("Name of the product you want to remove: ");
		remProd=br.readLine();
		product.remove(remProd);
		System.out.println("The product deleted successfully!");
		
		System.out.println("Size of TreeSet list: "+product.size());
	}
	
}
