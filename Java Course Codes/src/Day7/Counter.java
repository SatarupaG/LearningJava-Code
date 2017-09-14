package Day7;

public class Counter implements  Runnable
{
    Storage st;
    
    public Counter(Storage store)
    {
          st = store;
    }
    
    @Override
    public void run() 
    {
          synchronized(st) 
          {
                for(int i = 0 ; i < 10; i++)
                {
                      while(!st.isPrinted()) 
                      {             
                         try 
                         {
                            st.wait();
                         } catch(Exception e) 
                         {  
                        	 e.printStackTrace();
                         }
                      }
                      st.setValue(i);
                      System.out.println(Thread.currentThread().getName() + " = "+st.getValue());
                      st.setPrinted(false);
                      st.notify();
                }
          }
    }

}