package Day2;

import java.util.*;

public class TestCompartment 
{
	public static void main(String[] args) 
	{
		Compartment[] c=new Compartment[10];
		for(int i=0;i<10;i++)
		{
			Random rand=new Random();
			int randomNum = rand.nextInt((4-1)+1)+1;
			if(randomNum==1)
			{
				c[i]=new FirstClass();
				c[i].notice();
			}
			
			if(randomNum==2)
			{
				c[i]=new Ladies();
				c[i].notice();
			}
			
			if(randomNum==3)
			{
				c[i]=new General();
				c[i].notice();
			}
			
			if(randomNum==4)
			{
				c[i]=new Luggage();
				c[i].notice();
			}
		}		
	}
}
