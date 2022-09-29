//This program is created by Aryaan Rabara 21CE112
//Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC6.git
/*Question:- Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the priority of 
the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7
Set and get Priority methods are used to execute the object on resource */
class Mythread1 extends Thread
{
public void run()
{
for(int i=0;i<4;i++)
{
System.out.println("Priority of Thread is :-    "+this.getPriority());
}
}
}
//Thread priority is used to set its execution in desired order
/*  the lowest prioirity thread with more execution time will be
executed at last and the opposite case will be executed first.*/
public class Prac_6_4 {
public static void main(String[] args) {
Mythread1 First = new Mythread1();
Mythread1 Second = new Mythread1();
Mythread1 Third = new Mythread1();

First.setPriority(3); // set priority to lowest among these 3
Second.setPriority(5); // set priority as normal
Third.setPriority(7);// set priority to max among these 3

First.start();
Second.start();
Third.start();

//We have 3 object so it will print 12 times
System.out.println("This program is created by Aryaan Rabara 21CE112");
}
}