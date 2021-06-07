/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 06/06/21, 8:11 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("abc.txt");
        printWriter.println("Hello");
        System.out.println(10/0);
    }
}
