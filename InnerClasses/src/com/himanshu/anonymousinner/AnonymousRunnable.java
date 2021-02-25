/*
 * Copyright (c) 2021.
 * Name: Himanshu Kandpal
 * Git: https://github.com/himanshuKp
 * Email: hk@himanshukandpal.in
 */

package com.himanshu.anonymousinner;

public class AnonymousRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous runnable implementation");
            }
        });
        t.start();
    }
}
