package org.example;

public class Display {

    public synchronized void wish(String name){
        for (int i =1; i <=10 ; i++) {
            System.out.print("Good Afternoon,");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(name);
        }
    }

}
