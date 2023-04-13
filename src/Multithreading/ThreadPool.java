package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// this examples shows how to execute multiple threads in java using thread pool
public class ThreadPool {

    // how to execute multiple runnable thread (no return value) using a single thread pool
    public void SingleThreadPool1() {
        var executor = Executors.newSingleThreadExecutor();
        for (int i=0; i<10; i++)
        {
            executor.submit(new MyRunnable());
        }
    }

    // how to execute multiple callable thread (has return value) using a single thread pool
    public void SingleThreadPool2() throws ExecutionException, InterruptedException {
        var executor = Executors.newSingleThreadExecutor();
        for (int i=0; i<10; i++)
        {
            var future = executor.submit(new MyCallable(10, i));
            var result = future.get();
            System.out.println(result);
        }
    }

    // how to execute multiple runnable thread (no return value) using a fixed number of thread pool
    public void FixedThreadPool1() {
        var executor = Executors.newFixedThreadPool(5);
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            executor.submit(new MyRunnable());
        }
        pool.shutdown();
    }

    // how to execute multiple callable thread (has return value) using a fixed number of thread pool
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

    // how to execute multiple runnable thread (no return value) using a cached/reusable thread pool
    public void CachedThreadPool1() {
        var executor = Executors.newCachedThreadPool();
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            executor.submit(new MyRunnable());
        }
        pool.shutdown();
    }

    // how to execute multiple callable thread (has return value) using a cached/reusable thread pool
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

    // how to execute multiple runnable thread (no return value) using a scheduled/delayed thread pool
    public void ScheduledThreadPool1() {
        var executor = Executors.newScheduledThreadPool(5);
        var pool = (ThreadPoolExecutor)executor;
        for (int i=0; i<10; i++)
        {
            executor.schedule(new MyRunnable(),2,TimeUnit.SECONDS);
        }
        pool.shutdown();
    }

    // how to execute multiple callable thread (has return value) using a cached/reusable thread pool
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
