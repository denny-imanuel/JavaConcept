package Multithreading;

public class MySimpleThread extends Thread {
    public void run(){
        System.out.println("Running Simple Thread: " + Thread.currentThread().getId());
    }
}

