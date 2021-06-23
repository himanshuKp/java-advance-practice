/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/06/21, 5:40 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class FinalVGeek {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Hello");
//        even though reference variable sb is final
//        we can perform any changes
        sb.append("GF");
        System.out.println(sb);

//        we will get compile error, because reassignment
//        is not possible for final variable
//        no output will be printed.
//        sb = new StringBuffer("Hello world");
        System.out.println(sb);
    }
}
