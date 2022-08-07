/*
public static void yield()

This method pauses the execution of the current thread to execute other threads temporarily.

*/

package thread;

public class JavaYieldExp extends Thread
{
	public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        JavaYieldExp thread1 = new JavaYieldExp();  
        JavaYieldExp thread2 = new JavaYieldExp();  
        thread1.start();  
        thread2.start();  
        for (int i=0; i<3; i++)  
        {  
            thread1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  

}
