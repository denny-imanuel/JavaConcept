package Multithreading;

import java.util.concurrent.*;

// this class explain how to use basic multithreading in java
public class Multithreading {

    // how to execute a simple thread that extend Thread class and has no param/args
    public void ExecSimpleThread() {
        for (int i=0; i<10; i++) {
            var thread = new MySimpleThread();
            thread.start();
        }
    }

    // how to execute a param thread that extend Thread class and has param/args via constructor injection
    public void ExecParamThread() throws Exception {
        for (int i=0; i<10; i++) {
            var thread = new MyParamThread(10, i);
            thread.start();
            thread.join();
            var sum = thread.getResult();
        }
    }

    // how to execute a runnable thread that implement Runnable interface and has no return value
    public void ExecRunnable() {
        for (int i=0; i<10; i++) {
            var runnable = new MyRunnable();
            var thread = new Thread(runnable);
            thread.start();
        }
    }

    // how to execute a callable thread that implements Callable interface and has return value
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

    // how to execute a runnable task (no return value) using delta one liner in java
    public void RunnableTask() {
        Runnable runnable = ()-> {
            System.out.println("Running Thread");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

    // how to execute a callable task (has return value) using delta one liner in java
    public void CallableTask() {
        Callable<String> callable = () -> {
            System.out.println("Running Thread");
            return "Hello";
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callable);
    }

    // this is how to implement basic object locking in java
    public void ObjectLocking() throws InterruptedException {
        var main = new SyncLock();
        var thread1 = new Thread(()-> {
            for (int i=0; i<100; i++){
                main.LockAndCount();    // check this function
            }
        });
        var thread2 = new Thread(()-> {
            for (int i=0; i<100; i++){
                main.LockAndCount();    // check this function
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    // this is how to implement basic object synchronization in java
    public void ObjectSynchronization() throws InterruptedException {
        var main = new SyncLock();
        var thread1 = new Thread(()-> {
            for (int i=0; i<100; i++){
                try {
                    main.SyncAndCount();  // check this function
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        var thread2 = new Thread(()-> {
            for (int i=0; i<100; i++){
                try {
                    main.SyncAndCount();  // check this function
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
