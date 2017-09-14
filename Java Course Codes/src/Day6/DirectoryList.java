package Day6;

import java.io.*;

public class DirectoryList 
{
	public static void main(String[] args) 
	{
		File[] listOfFile;
		String foldername;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Enter Directory name:");
			foldername = bf.readLine();
			File inputFile = new File(foldername);
			
			if(inputFile.exists() && inputFile.isDirectory())
			{
				System.out.println("Directory exist..");
				listOfFile = inputFile.listFiles();
				System.out.println("List Of Files in the Directory " + foldername + ":");
				System.out.println("------------------------------------");
				for(int i = 0; i < listOfFile.length; i++)
				{
					File file = listOfFile[i];
					System.out.println(file.getName());
				}
			}
			else
				System.out.println("Directory does not exist..");
		}
		catch(Exception e )
		{
			System.out.println("Error");
		}
	}

}
