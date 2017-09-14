package Day2;

import java.io.*;

public class TestBook1 
{
	public static void main(String[] args) throws IOException 
{
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		Book book[] = new Book[4];
		
		for(i = 0; i < 4; i++)
		{
			if(i < 2)
			{
					book[i] = new Computer();
					System.out.println("Enter Computer Book Details:: ");
					System.out.println("Enter Book Type: ");
					((Computer) book[i]).setType(br.readLine());
					System.out.println("Enter Book No.: ");
					book[i].setBookNo(Integer.parseInt(br.readLine()));
					System.out.println("Enter Book Title: ");
					book[i].setTitle(br.readLine());
					System.out.println("Enter Book Publication: ");
					book[i].setPublication(br.readLine());
					System.out.println("Enter Book Author: ");
					book[i].setAuthor(br.readLine());
					System.out.println("Enter Book Price: ");
					book[i].setPrice(Float.parseFloat(br.readLine()));	
			}	
			else
			{
					book[i]= new Mathematics();
					System.out.println("Enter Mathematics Book Details:: ");
					System.out.println("Enter Book Type: ");
					((Mathematics) book[i]).setType(br.readLine());
					System.out.println("Enter Book No.: ");
					book[i].setBookNo(Integer.parseInt(br.readLine()));
					System.out.println("Enter Book Title: ");
					book[i].setTitle(br.readLine());
					System.out.println("Enter Book Publication: ");
					book[i].setPublication(br.readLine());
					System.out.println("Enter Book Author: ");
					book[i].setAuthor(br.readLine());
					System.out.println("Enter Book Price: ");
					book[i].setPrice(Float.parseFloat(br.readLine()));	
			}	
		}	

		for(i = 0; i < 4; i++)
		{
			if(i < 2)
			{
				System.out.println("Book Type: "+ ((Computer) book[i]).getType());
				System.out.println("Book No.: "+book[i].getBookNo());
				System.out.println("Book Title: "+book[i].getTitle());
				System.out.println("Book Publication: "+book[i].getPublication());
				System.out.println("Book Author: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getPrice());
		   	}
			else
			{
				System.out.println("Book Type: "+((Mathematics) book[i]).getType());
				System.out.println("Book No.: "+book[i].getBookNo());
				System.out.println("Book Title: "+book[i].getTitle());
				System.out.println("Book Publication: "+book[i].getPublication());
				System.out.println("Book Author: "+book[i].getAuthor());
				System.out.println("Book Price: "+book[i].getPrice());
			}
		}		
	}
}
