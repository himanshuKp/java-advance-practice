/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/06/21, 11:29 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");

//        read user input
        String userName = scanner.next();
        System.out.println("Username is: "+userName);
    }
}
