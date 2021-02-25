/*
 * Copyright (c) 2021.
 * Name: Himanshu Kandpal
 * Git: https://github.com/himanshuKp
 * Email: hk@himanshukandpal.in
 */

package com.himanshu.localinner;

public class Outer {

    void f1(){
        System.out.println("Inside outer f1()");
        class LocalInner{
            void f2(){
                System.out.println("Inside localinner f2()");
            }
        }
        LocalInner inner = new LocalInner();
//        you cannot acccess this f2 method outside the f1 method
        inner.f2();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f1();
    }

}
