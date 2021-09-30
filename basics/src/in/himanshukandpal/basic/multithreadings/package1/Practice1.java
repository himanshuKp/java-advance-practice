/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/09/21, 4:07 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package1;

class UploadResult extends Thread{

    @Override
    public void run() {
        System.out.println("Inside run");

        System.out.println(Thread.currentThread().getName());
    }
}

public class Practice1 {
    public static void main(String[] args) {
        UploadResult uploadThread = new UploadResult();
        System.out.println(Thread.currentThread().getName());
        uploadThread.start();
    }
}
