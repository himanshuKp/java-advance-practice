/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/05/21, 2:15 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.oop;

public class OuterClass {
    public static void exampleMethod(){
        class MethodLocalInnerClass{

        }
        System.out.println("static");
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.exampleMethod();
        OuterClass.exampleMethod();
    }
}
