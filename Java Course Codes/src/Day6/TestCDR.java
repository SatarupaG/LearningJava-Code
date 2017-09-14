package Day6;

import java.io.*;

public class TestCDR 
{
	public static void main(String[] args) 
	{
		CDR[] cdr = new CDR[5];
		int i;
		int sourceNumber;
		int destinationNumber;
		double duration;
		String data;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("ratedcdr.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for(i=0;i<5;i++)
			{
				System.out.print("Enter Source Number: ");
				sourceNumber = Integer.parseInt(bf.readLine());
				System.out.print("Enter Destination Number: ");
				destinationNumber = Integer.parseInt(bf.readLine());
				System.out.print("Enter Duration: ");
				duration = Double.parseDouble(bf.readLine());
				cdr[i] = new CDR(sourceNumber, destinationNumber, duration);
				cdr[i].calcuateCharge();
				bw.write("Record #"+(i+1));
				bw.newLine();
				bw.write("==============");
				bw.newLine();
				bw.write("Source Number: " + cdr[i].getSourceNumber());
				bw.newLine();
				bw.write("Destination Number: " + cdr[i].getDestinationNumber());
				bw.newLine();
				bw.write("Duration: " + cdr[i].getDuration());
				bw.newLine();
				bw.write("Charge: " + cdr[i].getCharge());
				if(i < 1)
				{
					bw.newLine();
					bw.newLine();
				}	
			}
		}
		catch(IOException e)
		{
			System.out.println("Writing Error");
		}
		finally 
		{
			try
			{
				bw.close();
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println("Fatal Writer Closing Error");
			}
		}
		
		try
		{
			fr = new FileReader("ratedcdr.txt");
			br = new BufferedReader(fr);
			while((data = br.readLine()) != null)
			{
				System.out.println(data);
			}
		}
		catch(IOException e)
		{
			System.out.println("Reading Error");
		}
		finally
		{
			try {
				br.close();
				fr.close();
			} 
			catch (IOException e) 
			{
				System.out.println("Fatal Reader Closing Error");
			}
		}
	}
}
