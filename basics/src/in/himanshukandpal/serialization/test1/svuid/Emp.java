/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/07/21, 5:24 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.serialization.test1.svuid;

import java.io.Serializable;

public class Emp implements Serializable {
    private static final long serialversionUID = 129348938L;
    transient int a;
    static int b;
    String name;
    int age;

    public Emp(int a, int b, String name, int age) {
        this.a = a;
        Emp.b = b;
        this.name = name;
        this.age = age;
    }
}
