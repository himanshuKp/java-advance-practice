/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/09/21, 2:57 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class UploadResultWithLock implements Runnable {
    private ReentrantLock reentrantLock;
    private int resultCount;

    public UploadResultWithLock(ReentrantLock reentrantLock) {
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (start) - Result uploaded: "+resultCount);
        try {
            reentrantLock.lock();
            Thread.sleep(2000);
            resultCount++;
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        } finally {
            reentrantLock.unlock();
        }
        System.out.println(Thread.currentThread().getName() + " (end) - Result uploaded: "+resultCount);
    }
}

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ExecutorService exServicePool = Executors.newFixedThreadPool(2);
        int noOfUploadTasks = 3;
        ReentrantLock lock = new ReentrantLock();
        UploadResultWithLock resultWithLock = new UploadResultWithLock(lock);
        for (int i = 0; i < noOfUploadTasks; i++) {
            exServicePool.submit(resultWithLock);
        }
        exServicePool.shutdown();
        while (!exServicePool.isTerminated()) {}
        System.out.println("Finished all threads");
    }
}
