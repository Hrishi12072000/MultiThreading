/*
  public final int getPriority()

  It is used to check the priority of the thread. When a thread is created, some priority is assigned to it. This priority is assigned either by the JVM or by the programmer explicitly while creating the thread.
 
 */

package thread;

public class JavaGetPriorityExp extends Thread
{
	public void run()  
    {    
        System.out.println("running thread name is:"+Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        JavaGetPriorityExp t1 = new JavaGetPriorityExp();    
        JavaGetPriorityExp t2 = new JavaGetPriorityExp();    
        System.out.println("t1 thread priority : " + t1.getPriority());   
        System.out.println("t2 thread priority : " + t2.getPriority());  
        t1.start();    
        t2.start();  
    }

}
