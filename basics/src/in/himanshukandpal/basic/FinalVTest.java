/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/06/21, 5:21 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class FinalVTest {
    public static void main(String[] args) {
        UnreachableUsingFinal usingFinal = new UnreachableUsingFinal();
        usingFinal.m1();
    }
}

class UnreachableUsingFinal {
    final int a = 13, b = 15;
    void m1(){
        while (a < b){
            System.out.println("Infinite loop");
        }
    }
}