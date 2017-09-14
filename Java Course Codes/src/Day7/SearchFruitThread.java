package Day7;

public class SearchFruitThread extends Fruit implements Runnable 
{
	@SuppressWarnings("unused")
	private Fruit fruit ;
	private Thread t;
	private String threadName;

	public SearchFruitThread(String threadName) 
	{
		super();
		this.threadName = threadName;
	}

	public SearchFruitThread(Fruit fruit) 
	{
		super();
		this.fruit = fruit;
	}

	@Override
	public void run() 
	{
		for(int i = 0; i < 5; i++)
		{
			if(names[i].equalsIgnoreCase("apple"))
			{
				System.out.println("Fruit Found : " + names[i]);
				break;
			}
			else
			{
				System.out.println("Fruit Not Found");
			}
		}
	}
	
	public void start() 
	{
		t= new Thread(this, threadName);
		t.start();
	}
}
