/*public final void setDaemon(boolean on)

This method of a thread is used to identify or mark the thread either daemon or a user thread. The JVM automatically terminates this thread when all the user threads die.

This thread method must run before the start of the execution of the thread.

*/

package thread;

public class JavaSetDaemonExp1 extends Thread
{
	public void run()  
    {    
        if(Thread.currentThread().isDaemon())  
        {  
            System.out.println("daemon thread work");    
        }    
        else 
        {    
            System.out.println("user thread work");    
        }    
    }    
    public static void main(String[] args)  
    {    
        JavaSetDaemonExp1 thread1=new JavaSetDaemonExp1();   
        JavaSetDaemonExp1 thread2=new JavaSetDaemonExp1();    
        JavaSetDaemonExp1 thread3=new JavaSetDaemonExp1();    
        thread1.setDaemon(true);  
        thread1.start();   
        thread2.setDaemon(true);  
        thread2.start();    
        thread3.start();    
    }

}
