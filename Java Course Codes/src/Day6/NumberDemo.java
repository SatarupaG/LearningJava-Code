package Day6;

import java.io.*;

public class NumberDemo 
{
	public static void main(String[] args) throws IOException 
	{
		int i,tempVar;
		String num;
		String data;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		File numberFile = new File("number.txt");
		File oddNumberFile = new File("odd.txt");
		File evenNumberFile = new File("even.txt");
		FileWriter fw = new FileWriter(numberFile);
		FileWriter fw2 = new FileWriter(evenNumberFile);
		FileWriter fw1 = new FileWriter(oddNumberFile);
		FileReader fr = new FileReader("number.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw1 = new BufferedWriter(fw1);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		BufferedReader br = new BufferedReader(fr);
		
		for(i=0;i<10;i++)
		{
			System.out.print("Enter a number: ");
			num =bf.readLine();
			bw.write(num);
			bw.newLine();
		}
		bw.close();
		fw.close();
		
		while((data = br.readLine()) != null)
		{
			tempVar = Integer.parseInt(data);
			System.out.println(tempVar);
			if(tempVar % 2 == 0)
			{
				bw2.write(tempVar + "\n");
				bw2.newLine();
			}
			else
			{
				bw1.write(tempVar + "\n");
				bw1.newLine();
			}
		}
		bw1.close();
		fw1.close();
		bw2.close();
		fw2.close();
br.close();
	}
}
