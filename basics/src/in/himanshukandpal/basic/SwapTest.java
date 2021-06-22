/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/06/21, 1:03 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class SwapTest {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        swap(a,b);
        System.out.println(a+" "+b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
