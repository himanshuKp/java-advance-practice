/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 3:25 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.methodref.constructor;

public class TestDemo {
    public static void main(String[] args) {
//        Using lambdas
        MyClassInterface myClassInterface = script -> new MyClass(script);
        myClassInterface.get("Using lambdas");

//        using constructor mapping
        MyClassInterface myClassInterface1 = MyClass::new;
        myClassInterface1.get("Using constructor mapping");

    }
}
