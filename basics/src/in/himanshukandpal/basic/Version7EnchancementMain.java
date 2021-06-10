/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/06/21, 7:29 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class Version7EnchancementMain {
    static {
        System.out.println("Test");
//        will not show main method output, only static block will run
        System.exit(0);
    }
    public static void main(String[] args) {
        System.out.println("Main");
    }
}
