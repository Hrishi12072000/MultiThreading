/*
  public static Thread currentThread()

  It returns a reference to the currently running thread.

 */


package thread;

public class CurrentThreadExp extends Thread
{
	 public  void run()  // IS line mei static word nhi aayega kiu run() methode hai na
	    {    
	        System.out.println("Hello "+Thread.currentThread().getName());    
	    }    
	    public static void main(String args[])  
	    {    
	       // CurrentThreadExp thread1=new CurrentThreadExp();    
	       // CurrentThreadExp thread2=new CurrentThreadExp();    
	        thread1.start();    
	        thread2.start();    
	    }  

}
