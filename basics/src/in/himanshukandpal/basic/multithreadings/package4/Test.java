/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/09/21, 5:01 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package4;

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Inside thread 1");
        for (int i = 0; i < 4; i++) {
            System.out.println("Inside thread 1= value: "+i);
        }
        System.out.println("Thread 1 finished");
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Inside thread 2");
        for (int i = 0; i < 4; i++) {
            System.out.println("Inside thread 2= value: "+i);
        }
        System.out.println("Thread 2 finished");
    }
}

public class Test {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
