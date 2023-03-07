package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Multithreading {

    public void ExecSimpleThread() {
        for (int i=0; i<10; i++) {
            var thread = new MySimpleThread();
            thread.start();
        }
    }

    public void ExecParamThread() throws Exception {
        for (int i=0; i<10; i++) {
            var thread = new MyParamThread(10, i);
            thread.start();
            thread.join();
            var sum = thread.getResult();
        }
    }

    public void ExecRunnable() {
        for (int i=0; i<10; i++) {
            var runnable = new MyRunnable();
            var thread = new Thread(runnable);
            thread.start();
        }
    }
    public void ExecCallable() throws Exception {
        for (int i=0; i<10; i++) {
            var callable = new MyCallable(10, i);
            var future = new FutureTask<>(callable);
            var thread = new Thread(future);
            thread.start();
            thread.join();
            var result = future.get();
        }
    }

    public void RunnableTask() {
        Runnable runnable = ()-> {
            System.out.println("Running Thread");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
