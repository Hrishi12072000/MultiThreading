/*
public void destroy()

This thread method destroys the thread group as well as its subgroups.

*/

package thread;

public class JavaDestroyExp extends Thread
{
	JavaDestroyExp(String threadname, ThreadGroup tg)  
    {  
        super(tg, threadname);  
        start();  
    }  
    public void run()  
    {  
        for (int i = 0; i < 2; i++)   
        {  
            try 
            {  
                Thread.sleep(10);  
            }  
            catch (InterruptedException ex) {  
                System.out.println("Exception encounterted");}  
        }  
        System.out.println(Thread.currentThread().getName() +  
              " finished executing");  
    }  
    public static void main(String arg[]) throws InterruptedException, SecurityException  
    {  
        ThreadGroup g1 = new ThreadGroup("Parent thread"); 
        ThreadGroup g2 = new ThreadGroup(g1, "child thread");  
        JavaDestroyExp thread1 = new JavaDestroyExp("Thread-1", g1);  
        JavaDestroyExp thread2 = new JavaDestroyExp("Thread-2", g1);  
        thread1.join();  
        thread2.join();  
        g2.destroy();  
        System.out.println(g2.getName() + " destroyed");  
        g1.destroy();  
        System.out.println(g1.getName() + " destroyed");  
    }  

}
