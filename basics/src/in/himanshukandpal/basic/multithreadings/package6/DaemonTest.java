/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/09/21, 1:22 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package6;

public class DaemonTest extends Thread{
    public DaemonTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println(getName()+ " is a daemon thread");
        } else {
            System.out.println(getName()+ " is not a daemon thread");
        }
    }

    public static void main(String[] args) {
        DaemonTest thread1 = new DaemonTest("thread1");
        DaemonTest thread2 = new DaemonTest("thread2");
        DaemonTest thread3 = new DaemonTest("thread3");

        thread1.setDaemon(true);
        thread1.start();
        thread2.start();

        thread3.setDaemon(true);
        thread3.start();
    }
}
