package Day2;

import java.io.*;

public class TestBook2 
{
	public static void main(String[] args) throws IOException
	{
		int bookNo;
		String title;
		String type;
		String publication;
		String author;
		float price;
		int i;
		int searchBookNumber;
		String searchBookAuthor;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BookData bd = new BookData();
		
		for(i=0;i<4;i++)
		{
			if(i<2)
			{
				System.out.println("Enter Computer Book Details:: ");
				System.out.print("Enter Book Type: ");
				type = br.readLine();
				System.out.print("Enter Book No.: ");
				bookNo = Integer.parseInt(br.readLine());
				System.out.print("Enter Book Title: ");
				title = br.readLine();
				System.out.print("Enter Book Publication: ");
				publication = br.readLine();
				System.out.print("Enter Book Author: ");
				author = br.readLine();
				System.out.print("Enter Book Price: ");
				price = Float.parseFloat(br.readLine());			
				bd.setIndex(i);
				bd.setBookComputer(bookNo, title, publication, author, price, type);
			}			
			else 
			{
				System.out.println("Enter Mathematics Book Details:: ");
				System.out.print("Enter Book Type: ");
				type = br.readLine();
				System.out.print("Enter Book No.: ");
				bookNo = Integer.parseInt(br.readLine());
				System.out.print("Enter Book Title: ");
				title = br.readLine();
				System.out.print("Enter Book Publication: ");
				publication = br.readLine();
				System.out.print("Enter Book Author: ");
				author = br.readLine();
				System.out.print("Enter Book Price: ");
				price = Float.parseFloat(br.readLine());			
				bd.setIndex(i);
				bd.setBookMathematics(bookNo, title, publication, author, price, type);
			}
				
		}
		
		bd.printBooks();
		
		System.out.print("Enter Book Number to search: ");
		searchBookNumber = Integer.parseInt(br.readLine());
		
		System.out.println("SEARCH RESULTS::");
		String tempArr = bd.searchByNo(searchBookNumber);
		if(tempArr.contentEquals("Not Exist"))
		{
			System.out.println("The book does not exist....");
		}
		else
		{
			System.out.println(tempArr);
		}

		System.out.print("Enter Author to search: ");
		searchBookAuthor = br.readLine();
		
		System.out.println("SEARCH RESULTS::");
		String tempArr1 = bd.searchByAuthor(searchBookAuthor);
		if(tempArr1.contentEquals("Not Exist"))
		{
			System.out.println("The book does not exist....");
		}
		else
		{
			System.out.println(tempArr1);
		}
	}
}
