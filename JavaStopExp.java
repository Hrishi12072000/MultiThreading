/*
  public final void stop()

  As the name suggests, this method is used to stop the currently running thread. Remember, once the thread execution is stopped, it cannot be restarted.

*/
package thread;

public class JavaStopExp extends Thread
{
	public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try 
            {  
                sleep(500);  
                System.out.println(Thread.currentThread().getName());    
            }
            catch(InterruptedException e)
            {
            	System.out.println(e);
            }    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        JavaStopExp thread1=new JavaStopExp ();    
        JavaStopExp thread2=new JavaStopExp ();   
        JavaStopExp thread3=new JavaStopExp ();  
        JavaStopExp thread4=new JavaStopExp ();   
        JavaStopExp thread5=new JavaStopExp ();   
        thread1.start();  
        thread2.start();
        thread3.start();
        thread2.stop(); 
        thread4.start();  
        thread5.start();
         
    }    

}
