package Day2;

public class TestMedicine 
{
	public static void main(String[] args) 
	{
		Medicine[] med = new Medicine[4];
		int i;
		med[0] = new Tablet();
		med[1] = new Syrup();
		med[2] = new Ointment();
		med[3] = new Medicine();
		for(i = 0; i < 20 ; i++)
		{
			int a = (int) (Math.random()*10);
			System.out.println(a);
			if(a < 4)
			{
				med[a].displayLabel();
			}
		}
	}
}
