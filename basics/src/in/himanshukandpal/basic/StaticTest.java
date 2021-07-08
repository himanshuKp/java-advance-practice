/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 08/07/21, 6:42 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class StaticTest {
    static {
        System.out.println("static block");
    }

    public static void test(){
        System.out.println("test static method.");
    }

    public static void main(String[] args) {
        System.out.println("main block");
        test();
    }
}
