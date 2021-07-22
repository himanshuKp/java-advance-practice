/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/07/21, 4:01 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable anonymous method.");
            }
        });
        t.start();

        Thread t1 = new Thread(()-> System.out.println("Runnable lambda method."));
        t1.start();
    }
}
