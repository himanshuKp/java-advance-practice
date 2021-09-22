/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/09/21, 11:03 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.scanners;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter your rollno");
        int rollno = se.nextInt();
        System.out.println("Enter your name");
        String name = se.next();
        System.out.println("Enter your fee");
        double fee = se.nextDouble();
        System.out.println("Rollno: "+rollno+", Name: "+name+", Fee: "+fee);
        se.close();
    }
}
