/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/06/21, 9:27 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.Scanner;

public class Differ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ënter an integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter a string: ");
        String b = scanner.nextLine();
        System.out.printf("You have entered the number: "+a+" and the string: "+b);
    }
}
