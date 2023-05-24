package org.example;

public class MyThreadDemo3 extends Thread{

    @Override
    public void run() {
        for (int i = 10; i <=20 ; i++) {
            System.out.println("Child Thread:"+i);
        }
    }
}
