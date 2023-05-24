package org.example;

public class App4 {
    public static void main(String[] args) {

        Display d1=new Display();
        String name1="Raj";
        String name2="Prudhvi";
        MyThread3 t1=new MyThread3(d1,name1);
        MyThread3 t2=new MyThread3(d1,name2);
        t1.start();
        t2.start();

    }
}
