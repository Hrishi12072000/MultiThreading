/*
  public boolean isInterrupted()  

  This thread method is used to test whether the thread is interrupted or not. It will return the value of the internal flag as true or false, i.e. if the thread is interrupted, it will return true else, it will return false.

*/

package thread;

public class JavaIsInterruptedExp extends Thread
{
	 public void run()   
	    {   
	        for(int i=1;i<=3;i++)   
	        {   
	            System.out.println("doing task....: "+i);   
	        }   
	    }   
	    public static void main(String args[])throws InterruptedException   
	    {   
	        JavaIsInterruptedExp thread1=new JavaIsInterruptedExp();   
	        JavaIsInterruptedExp thread2=new JavaIsInterruptedExp();   
	        thread1.start();   
	        thread2.start();  
	        System.out.println("is thread interrupted..: "+thread1.isInterrupted());  
	        System.out.println("is thread interrupted..: "+thread2.isInterrupted());  
	        thread1.interrupt();   
	        System.out.println("is thread interrupted..: " +thread1.isInterrupted());   
	        System.out.println("is thread interrupted..: "+thread2.isInterrupted());   
	    }  

}
