/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 04/05/21, 5:46 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.recursion;

public class RecursiveApproach {

    private static int recursiveCall(int n){
        if(n > 0){
            return n * recursiveCall(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursiveCall(4));
    }
}
