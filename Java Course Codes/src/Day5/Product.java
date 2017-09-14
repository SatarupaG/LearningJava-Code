package Day5;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Product 
{
	private int productId;
	private String productName;
	private Hashtable<Integer, String> productTable=new Hashtable<Integer, String>();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public void setProductNames() throws IOException
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter Product ID: ");
			productId=Integer.parseInt(br.readLine());
			System.out.print("Enter Product Name: ");
			productName=br.readLine();
			productTable.put(productId,productName);
		}
	}
	
	public void getProductIDValue(String productName)
	{
		boolean blnExists = productTable.containsValue(productName);
		if(blnExists==true)
		{
			for (Entry<Integer, String> entry : productTable.entrySet()) 
			{
				if (entry.getValue().equals(productName)) 
				{
				    System.out.println(entry.getKey());
				}
			}
		 }
	}
	
	public void checkValue(String productName)
	{
		boolean blnExists = productTable.containsValue(productName);
		if(blnExists==true)
		{
			System.out.print("The Product name exists in the table");
		}
	}
	
	public void removeProduct(int productID)
	{
		boolean blnExists = productTable.containsKey(productID);
		 if(blnExists==true)
		 {
			 productTable.remove(productID);
			 System.out.println("The Product Name is deleted successfully....");
		 }
	}
	
}
