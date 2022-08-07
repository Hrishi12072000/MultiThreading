/*
  public static int activeCount()

  This method of the thread is used to return the no. of active threads in the currently executing thread’s thread group.

  The number returned by this threading method is only an estimate number as the number of threads dynamically changes while this method traverses internal data structures.

*/

package thread;

public class JavaActiveCount extends Thread
{
	JavaActiveCount(String threadname, ThreadGroup tg)  
    {  
        super(tg, threadname);  
        start();  
    }  
    public void run()  
    {  
       System.out.println("running thread name is:"+Thread.currentThread().getName());    
    }  
    public static void main(String arg[])  
    {  
        ThreadGroup g1 = new ThreadGroup("parent thread group");  
        JavaActiveCount thread1 = new JavaActiveCount("Thread-1", g1);  
        JavaActiveCount thread2 = new JavaActiveCount("Thread-2", g1);  
         System.out.println("number of active thread: "+ g1.activeCount());  
    }  

}
