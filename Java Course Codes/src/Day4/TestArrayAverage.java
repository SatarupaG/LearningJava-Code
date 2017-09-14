package Day4;

import java.io.IOException;

public class TestArrayAverage 
{
	public static void main(String[] args) throws IOException 
	{
		ArrayNumber a = new ArrayNumber();
		a.setElements();
		a.printElements();
		a.calculateSum();
		try
		{
			a.printAverage();
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Cannot divide by zero");
		}
	}

}

