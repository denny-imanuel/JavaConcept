package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// This sample shows basic usage of object locking and synchronization in java
public class SyncLock {
    private int count = 0;

    // basic locking can be achieved by creating locker object from ReentrantLock()
    private Lock locker = new ReentrantLock();
    public void LockAndCount() {
        locker.lock();
        try {
            count++;
            System.out.println(count);
        } finally {
            locker.unlock();
        }
    }

    // basic synchronization can be achieved using synchronized keyword
    public synchronized void SyncAndCount() throws InterruptedException {
        count++;
        System.out.println(count);
    }
}
