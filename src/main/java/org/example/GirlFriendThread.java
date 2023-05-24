package org.example;

public class GirlFriendThread extends Thread{
    @Override
    public void run() {

        BoyFriendThread boyFriendThread=new BoyFriendThread();
        boyFriendThread.start();
        try
        {
            boyFriendThread.join(10000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }


        for (int i = 5; i <=10 ; i++) {
            System.out.println("Oh ok, wait there, i am comming after completing multithreading concept!");
        }
    }
}
