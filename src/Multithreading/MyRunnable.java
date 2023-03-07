package Multithreading;

import java.lang.Runnable;
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running Runnable: " + Thread.currentThread().getId());
    }
}
