package Multithreading;

public class MyParamThread extends Thread {

    private volatile int a;
    private volatile int b;
    private volatile int sum;
    public MyParamThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        sum = a + b;
        System.out.println("Running Param Thread " + Thread.currentThread().getId() + " - " + sum);
    }
    public int getResult() {
        return sum;
    }
}
