/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/09/21, 4:36 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package3;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Inside child thread");
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(myThread.isAlive());
        myThread.join();
        System.out.println(myThread.isAlive());
        Thread.sleep(3000);
        System.out.println("Main thread ends");
    }
}
