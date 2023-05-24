package org.example;

public class BoyFriendThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("From BoyFriend Thread ,Hello, I am waiting in cafeteria!");
        }
    }
}
