package Day2;

import java.io.*;

public class TestBook0 
{
	public static void main(String[] args) throws IOException 
{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		

		Computer c = new Computer();
		System.out.println("Enter Computer Book Details:: ");
		System.out.print("Enter Book Type: ");
		c.setType(br.readLine());
		System.out.print("Enter Book Number: ");
		c.setBookNo(Integer.parseInt(br.readLine()));
		System.out.print("Enter Book Title: ");
		c.setTitle(br.readLine());
		System.out.print("Enter Book Publication: ");
		c.setPublication(br.readLine());
		System.out.print("Enter Book Author: ");
		c.setAuthor(br.readLine());
		System.out.print("Enter Book Price: ");
		c.setPrice(Float.parseFloat(br.readLine()));	
	
		Mathematics m =  new Mathematics();
		System.out.print("Enter Mathematics Book Details:: ");
		System.out.print("Enter Book Type: ");
		m.setType(br.readLine());
		System.out.print("Enter Book Number: ");
		m.setBookNo(Integer.parseInt(br.readLine()));
		System.out.print("Enter Book Title: ");
		m.setTitle(br.readLine());
		System.out.print("Enter Book Publication: ");
		m.setPublication(br.readLine());
		System.out.print("Enter Book Author: ");
		m.setAuthor(br.readLine());
		System.out.print("Enter Book Price: ");
		m.setPrice(Float.parseFloat(br.readLine()));	
		
		System.out.println("Book Type: "+ c.getType());
		System.out.println("Book Number: "+ c.getBookNo());
		System.out.println("Book Title: "+ c.getTitle());
		System.out.println("Book Publication: "+ c.getPublication());
		System.out.println("Book Author: "+ c.getAuthor());
		System.out.println("Book Price: "+ c.getPrice());
		   	
		System.out.println("Book Type: "+m.getType());
		System.out.println("Book Number: "+ m.getBookNo());
		System.out.println("Book Title: "+ m.getTitle());
		System.out.println("Book Publication: "+ m.getPublication());
		System.out.println("Book Author: "+ m.getAuthor());
		System.out.println("Book Price: "+ m.getPrice());		
	}
}
