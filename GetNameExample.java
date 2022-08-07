/*
 public final String getName()

 This method of thread class is used to return the name of the thread. We cannot override this method in our program, as this method is final.

*/


package thread;

public class GetNameExample extends Thread
{
	public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {   
        // creating two threads   
        GetNameExample thread1=new GetNameExample();    
        GetNameExample thread2=new GetNameExample();    
        System.out.println("Name of thread1: "+ thread1.getName());    
        System.out.println("Name of thread2: "+thread2.getName());    
        thread1.start();    
        thread2.start();    
    }

}
