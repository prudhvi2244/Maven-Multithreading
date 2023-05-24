package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyThread1 t1=new MyThread1();
        t1.start();

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Main Thread!");
        }
    }
}
