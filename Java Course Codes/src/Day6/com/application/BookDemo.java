package Day6.com.application;

import java.io.*;
import Day6.com.pearson.*;

public class BookDemo 
{
	public static void main(String[] args) throws Exception 
	{	
		Book[] book = new Book[5];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		File bookDetails = new File("book.txt");
		FileWriter fw = new FileWriter(bookDetails);
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader fr = new FileReader(bookDetails);
		BufferedReader br = new BufferedReader(fr);
		String data;
		
		for(int i=0;i<5;i++)
		{
			book[i] = new Book();
			System.out.print("Enter book number: ");
			book[i].setBookNo(Integer.parseInt(bf.readLine()));
			System.out.print("Enter book title: ");
			book[i].setTitle(bf.readLine());
			System.out.print("Enter book price: ");
			book[i].setPrice(Double.parseDouble(bf.readLine()));
			String s = book[i].getBookNo()+"| "+book[i].getTitle()+"| "+book[i].getPrice();
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		fw.close();
		
		while((data = br.readLine()) != null)
		{
			System.out.println(data);
		}
		br.close();
		fr.close();
	}
}
