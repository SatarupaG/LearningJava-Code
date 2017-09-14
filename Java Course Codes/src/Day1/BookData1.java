package Day1;

import java.io.*;

public class BookData1 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BookDetails bkDtls=new BookDetails();
		bkDtls.setBooks();
		bkDtls.printBooks();
		System.out.print("Enter the Title of the Book to Search: ");
		bkDtls.searchBookByTitle(br.readLine());
		System.out.print("Enter the Author of the Book to Search: ");
		bkDtls.searchBookByAuthor(br.readLine());
		System.out.print("Enter the Publication of the Book to Search: ");
		bkDtls.searchBookByPublication(br.readLine());
	}
}
