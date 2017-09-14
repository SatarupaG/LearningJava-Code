package Day6;

import java.io.*;

public class FileWrite 
{
	public static void main(String[] args) 
	{	
		String data;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("letter.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String demo = "";
		try
		{
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for(int i = 0; i < 5; i++)
			{
				System.out.print("Enter Line "+(i+1)+": ");
				demo = bf.readLine();
				bw.append(demo);
				bw.newLine();
			}
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
		finally
		{
			try {
				bw.close();
				fw.close();
				System.out.println(file.length());
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		try
		{
			fr = new FileReader("letter.txt");
			br = new BufferedReader(fr);
			while((data = br.readLine()) != null)
			{
				System.out.println(data);
			}
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
		finally
		{
			try {
				br.close();
				fr.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		if(file.delete()){
			System.out.println(file.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation failed.");
		}
	}
}
