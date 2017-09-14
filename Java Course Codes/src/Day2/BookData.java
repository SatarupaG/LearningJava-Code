package Day2;

public class BookData
{
	private Book book[] = new Book[4];
	private int index;
	
	public int getIndex() 
	{
		return index;
	}

	public void setIndex(int index) 
	{
		this.index = index;
	}
	
	public void setBookComputer(int bookNo, String title, String publication, String author, float price, String type)
	{
		book[index] = new Computer();
		book[index].setAuthor(author);
		book[index].setBookNo(bookNo);
		((Computer) book[index]).setType(type);
		book[index].setPrice(price);
		book[index].setPublication(publication);
		book[index].setTitle(title);
	}
	
	public void setBookMathematics(int bookNo, String title, String publication, String author, float price, String type)
	{
		book[index] = new Mathematics();
		book[index].setAuthor(author);
		book[index].setBookNo(bookNo);
		((Mathematics) book[index]).setType(type);
		book[index].setPrice(price);
		book[index].setPublication(publication);
		book[index].setTitle(title);
	}

	public void printBooks() 
	{
		for(index=0;index<4;index++)
		{
			if(index<2)
			{
				System.out.println("Book Type: "+ ((Computer) book[index]).getType());
				System.out.println("Book No.: "+book[index].getBookNo());
				System.out.println("Book Title: "+book[index].getTitle());
				System.out.println("Book Publication: "+book[index].getPublication());
				System.out.println("Book Author: "+book[index].getAuthor());
				System.out.println("Book Price: "+book[index].getPrice());
		   }
			else
			{
				System.out.println("Book Type: "+((Mathematics) book[index]).getType());
				System.out.println("Book No.: "+book[index].getBookNo());
				System.out.println("Book Title: "+book[index].getTitle());
				System.out.println("Book Publication: "+book[index].getPublication());
				System.out.println("Book Author: "+book[index].getAuthor());
				System.out.println("Book Price: "+book[index].getPrice());
			}
		}
	}
	
	public String searchByNo (int bookNo) 
	{
		int i;
		boolean flag = false;
		for(i=0;i<4;i++)
		{
			if(book[i].getBookNo() == bookNo)
			{
				flag = true;
				if(i<2)
				{
				return "Book Type: "+((Computer) book[i]).getType() +" Book No.: "+book[i].getBookNo()+" Book Title: "+book[i].getTitle()
						+" Book Publication: "+book[i].getPublication()+" Book Author: "+book[i].getAuthor()
						+" Book Price: "+book[i].getPrice();
				}
				else
				{
				return "Book Type: "+((Mathematics) book[i]).getType() +" Book No.: "+book[i].getBookNo()+" Book Title: "+book[i].getTitle()
						+" Book Publication: "+book[i].getPublication()+" Book Author: "+book[i].getAuthor()
						+" Book Price: "+book[i].getPrice();
				}
			}
		}
		if(flag == false)
		{
			System.out.println("Book with Book No. "+bookNo+" Not Found."); 
		}
		return "Not Exist";	
	}
	
	public String searchByAuthor (String author) 
	{
		int i;
		boolean flag = false;
		for(i=0; i<4;i++)
		{
			if(book[i].getAuthor().equalsIgnoreCase(author))
			{
				flag = true;
				if(i<2)
				{
				return "Book Type: "+((Computer) book[i]).getType() +" Book No.: "+book[i].getBookNo()+" Book Title: "+book[i].getTitle()
						+" Book Publication: "+book[i].getPublication()+" Book Author: "+book[i].getAuthor()
						+" Book Price: "+book[i].getPrice();
				}
				else
				{
				return "Book Type: "+((Mathematics) book[i]).getType() +" Book No.: "+book[i].getBookNo()+" Book Title: "+book[i].getTitle()
						+" Book Publication: "+book[i].getPublication()+" Book Author: "+book[i].getAuthor()
						+" Book Price: "+book[i].getPrice();
				}
			}
		}
		if(flag == false)
		{
			System.out.println("Book with Author "+author+" Not Found.");
		}
		return "Not Exist";
	}
	
}
