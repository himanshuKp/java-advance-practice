/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 3:13 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.methodref;

public class MyClass {
    private void myMethod1(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
//        one way
        MyInterface i = new MyInterface() {
            @Override
            public void myMethod(int i) {
                System.out.println(i);
            }
        };
        i.myMethod(10);

//        another way using method reference
        MyClass c = new MyClass();
        MyInterface mi = c::myMethod1;
        mi.myMethod(20);
    }
}
