package Day1;

public class ArrayOperation 
{
	private int numbers[];
	
	public void setNumbers(int[] numbers) 
	{
		this.numbers = numbers;
	}
	public int[] getNumbers() 
	{
		return numbers;
	}

	public void printArray()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(numbers[i]);
		}
	}
	
	public int sumArray()
	{
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum=sum+numbers[i];
		}
		return sum;
	}
	
	public int maxNumber()
	{
		int MaxNum=numbers[0];
		for(int i=1;i<10;i++)
		{
			if(MaxNum<numbers[i])
			{
				MaxNum=numbers[i];
			}
		}
		return MaxNum;
	}

	public int minNumber()
	{
		int MinNum=numbers[0];
		for(int i=1;i<10;i++)
		{
			if(MinNum>numbers[i])
			{
				MinNum=numbers[i];
			}
		}
		return MinNum;
	}
	
	public int freqNumber(int number)
	{
		int freqNum=0;
		for(int i=0;i<10;i++)
		{
			if(number==numbers[i])
			{
				freqNum++;
			}
		}
		return freqNum;
	}
	
	public void primeNumbers()
	{
		boolean status=false;
		System.out.println("The prime numbers in the array: ");
		for(int i=0;i<10;i++)
		{
			status=GetPrime(numbers[i]);
			if(status==true)
			{
				System.out.println(numbers[i]);
			}
		}
	}

	private boolean GetPrime(int i) 
	{
		if(i>1)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					return false;
				}
			}
			return true;
		}
		else
			return false;		
	}
	
	public void evenNumbers()
	{
		System.out.println("The even numbers in the array: ");
		for(int i=0;i<10;i++)
		{
			if(numbers[i]%2==0 && numbers[i]!=0)
			{
				System.out.println(numbers[i]);
			}
		}
	}
	
	public void oddNumbers()
	{
		System.out.println("The odd numbers in the array: ");
		for(int i=0;i<10;i++)
		{
			if(numbers[i]%2!=0)
			{
				System.out.println(numbers[i]);
			}
		}
	}
	
	
	public int[] sortArray()
	{
		int tempArray[] =new int[10];
		tempArray=numbers;
		int temp=0;
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(tempArray[i]>tempArray[j])
				{
					temp=tempArray[i];
					tempArray[i]=tempArray[j];
					tempArray[j]=temp;
				}
			}
		}
		return tempArray;	
	}
	
	public void insertNumber(int number, int position)
	{
		for(int i=0;i<10;i++)
		{
			if(i==position)
			{
				numbers[i]=number;
			}
		}
		printArray();
	}
	
	public void deleteNumber(int position)
	{
		for(int i=0;i<10;i++)
		{
			if(i==position)
			{
				numbers[i]=0;
			}
		}
		printArray();
	}
}

