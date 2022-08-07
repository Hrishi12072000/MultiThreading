/*
 public static boolean holdsLock(Object obj)
 
 This thread method checks if the currently executing thread holds the monitor lock on the specified object. 

 If it does, then this threading method will return true.

*/

package thread;

public class JavaHoldsLock 
{
	public void run()   
    {  
        System.out.println("Currently executing thread is: " + Thread.currentThread().getName());  
        System.out.println("Does thread holds lock? " + Thread.holdsLock(this));  
        synchronized (this)   
        {  
            System.out.println("Does thread holds lock? " + Thread.holdsLock(this));  
        }  
    }  
    public static void main(String[] args)   
    {  
    	JavaHoldsLock g1 = new JavaHoldsLock();  
        //Thread thread1 = new Thread(g1);  
    	Thread thread1 = new Thread();  
        thread1.start();  
    }

}
