package org.example;

public class App2 {
    public static void main(String[] args) {

        MyThreadDemo3 t1=new MyThreadDemo3();
        t1.start();
        t1.yield();
        for (int i = 50; i <=60 ; i++) {
            System.out.println("main Thread:"+i);
        }

    }
}
