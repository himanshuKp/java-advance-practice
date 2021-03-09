/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 3:04 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.methodref;

public class MethodRefDemo {
    private static void myMethod(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Method");
        }
    }

    public static void main(String[] args) {
        Runnable r = MethodRefDemo::myMethod;   //method reference
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main method");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
