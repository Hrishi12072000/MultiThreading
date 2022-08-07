/*
 public final void setPriority()

 This method is used to change the priority of the thread. The priority of every thread is represented by the integer number from 1 to 10. The default priority of a thread is 5.

 */

package thread;

public class JavaSetPriorityExp1 extends Thread
{
	 public void run()  
	    { 
	        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
	    }    
	    public static void main(String args[]) throws InterruptedException  
	    {    
	        JavaSetPriorityExp1 t1=new JavaSetPriorityExp1();
	        JavaSetPriorityExp1 t2=new JavaSetPriorityExp1();
	        JavaSetPriorityExp1 t3=new JavaSetPriorityExp1();
	        JavaSetPriorityExp1 t4=new JavaSetPriorityExp1();
	        t1.setPriority(Thread.MAX_PRIORITY); 
	        t2.setPriority(Thread.MIN_PRIORITY); 
	        t3.setPriority(Thread.NORM_PRIORITY); 
	        t4.setPriority(Thread.MAX_PRIORITY); 
	        t1.start();
	        t2.start();
	        try
	        {
	        t2.join();    // 
	        }
	        finally
	        {
	        	System.out.println("");
	        }
	        t3.start();
	        t4.start();
	        
	    }  

}
