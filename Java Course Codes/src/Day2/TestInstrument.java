package Day2;

public class TestInstrument 
{
	public static void main(String[] args) 
	{
		Instrument[] t=new Instrument[10];
		t[0] = new Piano();
		t[1] = new Piano();
		t[2] = new Flute();
		t[3] = new Guitar();
		t[4] = new Piano();
		t[5] = new Flute();
		t[6] = new Flute();
		t[7] = new Guitar();
		t[8] = new Piano();
		t[9] = new Piano();
		for(int i=0;i<10;i++)
		{
			if(t[i] instanceof Piano)
			{
				t[i].play();
			}
			if(t[i] instanceof Flute)
			{
				t[i].play();
			}
			if(t[i] instanceof Guitar)
			{
				t[i].play();
			}
		}
	}
}
