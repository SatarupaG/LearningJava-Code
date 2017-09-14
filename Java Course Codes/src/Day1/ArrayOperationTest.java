package Day1;

import java.io.*;

public class ArrayOperationTest 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayOperation ar=new ArrayOperation();

		int LocalArray[]=new int[10];
		int GetArray[]=new int[10];
		int FirstInput=0,SecondInput=0,PositionInput=0;
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter Number: ");
			LocalArray[i]=Integer.parseInt(br.readLine());
		}
		ar.setNumbers(LocalArray);

		ar.printArray();
		
		System.out.println("The summation of the Array: "+ar.sumArray());
		System.out.println("The maximum of the Array: "+ar.maxNumber());
		System.out.println("The minimum of the Array: "+ar.minNumber());
		System.out.print("Enter number to find frequency in the array: ");
		FirstInput=Integer.parseInt(br.readLine());
		System.out.println("The frequency of the given number: "+ar.freqNumber(FirstInput));
		ar.primeNumbers();
		ar.evenNumbers();
		ar.oddNumbers();
		GetArray=ar.sortArray();
		System.out.println("The sorted Array: ");
		for(int i=0;i<10;i++)
		{
			System.out.println(GetArray[i]);
		}
		System.out.print("Enter a number to insert in the Array: ");
		SecondInput=Integer.parseInt(br.readLine());
		System.out.print("Enter a position for the number: ");
		PositionInput=Integer.parseInt(br.readLine());
		ar.insertNumber(SecondInput, PositionInput);
		System.out.print("Enter the position of a number to delete in the array: ");
		PositionInput=Integer.parseInt(br.readLine());
		ar.deleteNumber(PositionInput);	
	}
}
