package Day7;

public class MyThread implements Runnable
{
	private Thread t;
	private String threadName;
	
	public MyThread(String threadName) 
	{
		super();
		this.threadName = threadName;
	}
	@Override
	public void run() 
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println("I can Run "+threadName+". My thread priority is "+t.getPriority());
			
		}
		try {
			t.join();
			Thread.sleep(30);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public void start() 
	{
		t= new Thread(this, threadName);
		t.start();
		if(t.getName().equalsIgnoreCase("Thread #1"))
{
			t.setPriority(3);
}	
		else 
{	
			t.setPriority(8);
}
	}

}
