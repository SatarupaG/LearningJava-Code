package Day6;

import java.io.*;

public class CopyFile
{
	public static void main(String[] args) throws IOException 
	{
		String source = null;
		String destination = null;
		String readData = null;
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter source file name: ");
		source = bf.readLine();
		File srcfile = new File(source);
		if(srcfile.exists())
		{
			System.out.println("Source file exists...");
			System.out.print("Enter destination file name: ");
			destination = bf.readLine();
			File destfile = new File(destination);
			if(destfile.exists())
			{
				System.out.println("Destination file exists...");
				System.out.print("Want to Overwrite? (Yes/No): ");
				String choice = bf.readLine();
				if(choice.equalsIgnoreCase("no"))
				{
					BufferedReader br = new BufferedReader(new FileReader(srcfile));
					BufferedWriter bw = new BufferedWriter(new FileWriter(destfile,true));
					while((readData = br.readLine()) != null)
					{
						bw.append(readData);
						bw.newLine();
					}
					br.close();
					bw.close();
				}
				else
				{
					BufferedReader br = new BufferedReader(new FileReader(srcfile));
					BufferedWriter bw = new BufferedWriter(new FileWriter(destfile));
					while((readData = br.readLine()) != null)
					{
						bw.write(readData);
						bw.newLine();
					}
					br.close();
					bw.close();
				}				
			}
			else
			{
				System.out.println("Destination file is created...");
				BufferedReader br = new BufferedReader(new FileReader(srcfile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(destfile));
				while((readData = br.readLine()) != null)
				{
					bw.write(readData);
					bw.newLine();
				}
				br.close();
				bw.close();
			}
		}
		else
		{
			System.out.println("Source file does not exist...");
		}
	}
}
