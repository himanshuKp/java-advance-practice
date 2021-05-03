/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 04/05/21, 5:20 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.recursion;

public class IterativeApproach {
    private static int iterativeFactorial(int n){
        int result = 1;
        while (n>0){
            result *= n;
            n -= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int fourFactorial = iterativeFactorial(4);
        System.out.println(fourFactorial);
    }
}
