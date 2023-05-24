package org.example;

public class App1 {
    public static void main(String[] args) {

        MyThread2 obj=new MyThread2();
        Thread t1=new Thread(obj,"Venky");
        t1.start();

        System.out.println("Name of main thread:"+Thread.currentThread().getName());
        Thread.currentThread().setName("Pushpa");
        System.out.println("After setting name for the thread,:"+Thread.currentThread().getName());
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Parent Thread :"+i);
        }
        System.out.println("Name of child thread:"+t1.getName());
        System.out.println("Priority of main() thread:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of main() thread:"+Thread.currentThread().getPriority());
    }
}
