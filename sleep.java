//This program is created Aryaan Rabara 21CE112
//Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC6.git
/*Question:Write a program to increment the value of one variable by one and display it after one second using thread using sleep() method. */
import java.util.*;

class Mythread extends Thread
{
     //here we Create A class who extends by thread class
        //here we mustly use run method
    int a;
    //Here we create constructor
    Mythread(int a)
    {
        this.a = a;
    }
    public void increment()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(++a);
            //sleep is a predifined method inside Thread class which will stop the thread execution for some tome which we have provided to the method in milliseconds
            try
        {
            sleep(1000);
            //this method must be written inside the try catch block because it throws the interrupted exception.
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        }
        System.out.println("This program is created by Aryaan Rabara 21CE112");
    }
    public void run()
    {
        //calling the increment method inside run()
        increment(); 
    }
}
public class sleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int a = sc.nextInt();
        Mythread m = new Mythread(a);
        m.start();
        //so suppose if we have entered the number 0 , it will print 1 to 5... each number with 1 second time interval.
    }
}