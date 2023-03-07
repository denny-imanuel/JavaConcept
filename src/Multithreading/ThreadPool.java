package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    public void SingleThreadPool1() {
        var executor = Executors.newSingleThreadExecutor();
        for (int i=0; i<10; i++)
        {
            executor.submit(new MyRunnable());
        }
    }

    public void SingleThreadPool2() throws ExecutionException, InterruptedException {
        var executor = Executors.newSingleThreadExecutor();
        for (int i=0; i<10; i++)
        {
            var future = executor.submit(new MyCallable(10, i));
            var result = future.get();
            System.out.println(result);
        }
    }

    public void FixedThreadPool1() {
        var executor = Executors.newFixedThreadPool(5);
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            executor.submit(new MyRunnable());
        }
        pool.shutdown();
    }

    public void FixedThreadPool2() throws ExecutionException, InterruptedException {
        var executor = Executors.newFixedThreadPool(5);
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            var future = executor.submit(new MyCallable(10, i));
            var result = future.get();
            System.out.println(result);
        }
        pool.shutdown();
    }

    public void CachedThreadPool1() {
        var executor = Executors.newCachedThreadPool();
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            executor.submit(new MyRunnable());
        }
        pool.shutdown();
    }

    public void CachedThreadPool2() throws ExecutionException, InterruptedException {
        var executor = Executors.newCachedThreadPool();
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            var future = executor.submit(new MyCallable(10,i));
            var result = future.get();
            System.out.println(result);
        }
        pool.shutdown();
    }

    public void ScheduledThreadPool1() {
        var executor = Executors.newScheduledThreadPool(5);
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            executor.schedule(new MyRunnable(),2,TimeUnit.SECONDS);
        }
        pool.shutdown();
    }

    public void ScheduledThreadPool2() throws ExecutionException, InterruptedException {
        var executor = Executors.newScheduledThreadPool(5);
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            var future = executor.schedule(new MyCallable(10, i),2,TimeUnit.SECONDS);
            var result = future.get();
            System.out.println(result);
        }
        pool.shutdown();
    }

}
