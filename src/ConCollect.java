import java.util.Arrays;
import java.util.concurrent.*;

public class ConCollect {

    public void ConSkipListSet() throws InterruptedException{
        var conSet = new ConcurrentSkipListSet<Integer>();
        Runnable task = ()->{
            conSet.addAll(Arrays.asList(3,3,2,2,1,1));  System.out.println("Thread " + Thread.currentThread().getId() + "-" + conSet);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    public void ConSkipListMap() throws InterruptedException{
        var conMap = new ConcurrentSkipListMap<Integer, String>();
        Runnable task = ()->{
            conMap.put(3,"ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
            conMap.put(2,"bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
            conMap.put(1,"aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    public void ConHashMap() throws InterruptedException {
        var conMap = new ConcurrentHashMap<Integer, String>();
        Runnable task = ()->{
            conMap.put(3, "ccc"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
            conMap.put(2, "bbb"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
            conMap.put(1, "aaa"); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conMap);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    public void ConLinkedQueue() throws InterruptedException {
        var conQueue = new ConcurrentLinkedQueue<Integer>();
        Runnable task = ()-> {
            conQueue.add(1); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.add(2); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.add(3); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
            conQueue.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conQueue);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    public void ConLinkedDeque() throws InterruptedException {
        var conDeque = new ConcurrentLinkedDeque<Integer>();
        Runnable task = ()-> {
            conDeque.add(2); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.addFirst(1); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.addLast(3); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.pollLast(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.pollFirst(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
            conDeque.poll(); System.out.println("Thread " + Thread.currentThread().getId() + "-" + conDeque);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }


}
