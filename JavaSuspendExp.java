/*
public final void suspend()

This method is used to suspend the currently running thread temporarily. Using the resume() method, you can resume the suspended thread.

*/

package thread;

public class JavaSuspendExp extends Thread 
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
        JavaSuspendExp thread1=new JavaSuspendExp ();    
        JavaSuspendExp thread2=new JavaSuspendExp ();   
        JavaSuspendExp thread3=new JavaSuspendExp ();
        thread1.start();  
        thread2.start();  
        thread2.suspend();   //thread ko stop kr diya hai
            //start krne ke liye thread2.resume(); krna hai
        thread3.start();  
    }    
}
