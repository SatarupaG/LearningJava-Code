package Day1;

import java.io.*;

public class BookDetails 
{
	private Book1 book[]=new Book1[5];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void setBooks() throws IOException 
	{
		int i=0;
		for(i=0;i<5;i++)
		{
			book[i]=new Book1();
		}
		for(i=0;i<5;i++)
		{
			System.out.print("Enter Book No: ");
			book[i].setBookNo(Integer.parseInt(br.readLine()));
			System.out.print("Enter Book Title: ");
			book[i].setTitle(br.readLine());
			System.out.print("Enter Book Publication: ");
			book[i].setPublication(br.readLine());
			System.out.print("Enter Book Author: ");
			book[i].setAuthor(br.readLine());
			System.out.print("Enter Book Price: ");
			book[i].setPrice(Float.parseFloat(br.readLine()));
		}
	}
	
	public void printBooks() 
	{
		int i=0;
		for(i=0;i<5;i++)
		{
			System.out.println("Book No: "+book[i].getBookNo());
			System.out.println("Book Title: "+book[i].getTitle());
			System.out.println("Book Publication: "+book[i].getPublication());
			System.out.println("Book Author: "+book[i].getAuthor());
			System.out.println("Book Price: "+book[i].getPrice());		
		}
	}
	
	public void searchBookByTitle(String title) 
	{
		int i=0;
		int SetStatus=0;
		for(i=0;i<5;i++)
		{
			if(book[i].getTitle().equals(title))
			{
				System.out.println("Book No: "+book[i].getBookNo());
				System.out.println("Book Title: "+book[i].getTitle());
				System.out.println("Book Publication: "+book[i].getPublication());
				System.out.println("Book Author: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getPrice());
				SetStatus=0;
				break;
			}
			else
			{
				SetStatus=1;
			}
		}
		if(SetStatus==1)
			{
				System.out.println("Sorry!Book with this Title does not exist.");
			}
	}
	
	public void searchBookByAuthor(String author)
	{
		int i=0;
		int SetStatus=0;
		for(i=0;i<5;i++)
		{
			if(book[i].getAuthor().equals(author))
			{
				System.out.println("Book No: "+book[i].getBookNo());
				System.out.println("Book Title: "+book[i].getTitle());
				System.out.println("Book Publication: "+book[i].getPublication());
				System.out.println("Book Author: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getPrice());
				SetStatus=0;
				break;
			}
			else
			{
				SetStatus=1;
			}
		}
		if(SetStatus==1)
			{
				System.out.println("Sorry!Book with this Author does not exist.");
			}
	}
	
	public void searchBookByPublication(String publication)
	{
		int i=0;
		int SetStatus=0;
		for(i=0;i<5;i++)
		{
			if(book[i].getPublication().equals(publication))
			{
				System.out.println("Book No: "+book[i].getBookNo());
				System.out.println("Book Title: "+book[i].getTitle());
				System.out.println("Book Publication: "+book[i].getPublication());
				System.out.println("Book Author: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getPrice());
				SetStatus=0;
				break;
			}
			else
			{
				SetStatus=1;
			}
		}
		if(SetStatus==1)
			{
				System.out.println("Sorry!Book with this Publication does not exist.");
			}
		
	}

}
