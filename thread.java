//This program is created Aryaan Rabara 21CE112
//Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC6.git
/*Question:Write a program to create thread which display “Hello World” message. 
by extending Thread class B. by using Runnable interface */
class thread1 extends Thread
    {
        //here we Create A class who extends by thread class
        //here we mustly use run method
        
        @Override
        public void run()
        {
            System.out.println("Hello world!!");
        }
    }

    class thread2 implements Runnable
    {
        //here we Create a class thread2 who implement by Runnable interface
        @Override
        public void run()
        {
            System.out.println("Hello world!!");
            System.out.println("This program is created Aryaan Rabara 21CE112");
        }
    }
  
public class thread
{
    public static void main(String[] args) {
       /*if we applied runnable interface then 
       we have to pass object of that class which is implementing runnable interface to the constructor of thread class.*/
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        Thread th2 = new Thread(t2);
        
        t1.start();
        th2.start();
    
    }
}