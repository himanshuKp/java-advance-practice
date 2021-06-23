/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/06/21, 11:47 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

class MyClass {
    public int a;
    public int b;

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean same(MyClass other){
        return other.a == this.a && other.b == this.b;
    }
}

public class ComparisonTest {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(30, 123);
        MyClass m2 = new MyClass(30, 111);
        MyClass m3 = new MyClass(m1.a, m2.b);

        System.out.println(m2.same(m3));
    }
}
