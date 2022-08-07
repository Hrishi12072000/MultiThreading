/*
public void interrupt()

This method of a thread is used to interrupt the currently executing thread. This method can only be called when the thread is in sleeping or waiting state.

But if the thread is not in the sleeping or waiting state, then the interrupt() method will not interrupt the thread but will set the interrupt flag to true.

*/

package thread;

public class JavaInterruptExp1 extends Thread
{
	 public void run()  
	    {    
	        try 
	        {    
	            Thread.sleep(1000);    
	            System.out.println("javatpoint");    
	        }catch(InterruptedException e){    
	            throw new RuntimeException("Thread interrupted..."+e);  
	               
	        }    
	    }    
	    public static void main(String args[])  
	    {    
	        JavaInterruptExp1 thread1=new JavaInterruptExp1();    
	        thread1.start();    
	        try 
	        {    
	            thread1.interrupt();    
	        }catch(Exception e){System.out.println("Exception handled "+e);}    
	    }    

}
