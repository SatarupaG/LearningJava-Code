package Day1;

public class EvenOdd 
{
		private int num;
		private boolean evenodd;
		
		public int getNum() 
		{
			return num;
		}	
		public void setNum(int num) 
		{
			this.num = num;
		}	
		public boolean isEvenodd()
		{
			return evenodd;
		}

		public void checkEvenOdd()
		{
			if(num%2==0)
			{
				evenodd=true;
			}
			else
			{
				evenodd=false;
			}
		}		
}
