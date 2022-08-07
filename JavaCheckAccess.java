/*
  public final void checkAccess()

  This thread method identifies if the current thread has permission to modify the thread.

*/

package thread;

public class JavaCheckAccess extends Thread
{
	public void run()  
    {  
        System.out.println(Thread.currentThread().getName()+" finished executing");  
    }  
    public static void main(String arg[]) throws InterruptedException, SecurityException    
    {
    	JavaCheckAccess thread1 = new JavaCheckAccess();    
        JavaCheckAccess thread2 = new JavaCheckAccess();    
        thread1.start();  
        thread2.start();  
        thread1.checkAccess();    
        System.out.println(thread1.getName() + " has access");    
        thread2.checkAccess();    
        System.out.println(thread2.getName() + " has access");    
    } 

}
