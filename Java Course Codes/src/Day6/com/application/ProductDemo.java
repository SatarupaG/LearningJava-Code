package Day6.com.application;

import java.io.*;
import Day6.com.product.*;

public class ProductDemo 
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Product[] product = new Product[10];
		String[] s;
		FileReader fr = new FileReader("product.txt");
		BufferedReader br = new BufferedReader(fr);
		String data;
		int j = 0;
		int p_no = 0;
		String p_name;
		double p_price;
		while((data = br.readLine()) != null)
		{
			s = data.split(",");
			p_no = Integer.parseInt(s[0]);
			p_name = s[1];
			p_price = Double.parseDouble(s[2]);
			product[j] = new Product();
			product[j].setProdNo(p_no);
			product[j].setProdName(p_name);
			product[j].setProdPrice(p_price);
			j++;
		}
		System.out.println("Product Details::");
		System.out.println("Product No, Product Name, Product Price");
		for(int i = 0; i < product.length; i++)
		{
			if(product[i] != null)
				System.out.println(product[i].getProdNo() + ", "+product[i].getProdName() + ", "+product[i].getProdPrice());
		}
		br.close();
		fr.close();
	}
}
