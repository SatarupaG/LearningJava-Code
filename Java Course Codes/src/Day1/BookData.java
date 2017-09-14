package Day1;

import java.io.*;

public class BookData 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Book[] b=new Book[5];
		
		for(int i=0;i<5;i++)
		{
			b[i]=new Book();
			System.out.print("Enter Book No: ");
			b[i].setBookNo(Integer.parseInt(br.readLine()));
			System.out.print("Enter Book Title: ");
			b[i].setTitle(br.readLine());
			System.out.print("Enter Book Publication: ");
			b[i].setPublication(br.readLine());
			System.out.print("Enter Author: ");
			b[i].setAuthor(br.readLine());
			System.out.print("Enter Price: ");
			b[i].setPrice(Integer.parseInt(br.readLine()));
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Book No: "+b[i].getBookNo());
			System.out.println("Enter Book Title: "+b[i].getTitle());
			System.out.println("Enter Book Publication: "+b[i].getPublication());
			System.out.println("Enter Author: "+b[i].getAuthor());
			System.out.println("Enter Price: "+b[i].getPrice());	
		}
	}
}

