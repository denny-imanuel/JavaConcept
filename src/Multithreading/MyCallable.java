package Multithreading;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private volatile int a;
    private volatile int b;

    public MyCallable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() {
        int sum = a + b;
        System.out.println("Running Callable: " + Thread.currentThread().getId() + " - " + sum);
        return sum;
    };
}
