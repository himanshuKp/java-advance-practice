/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/05/21, 1:26 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.oop;

public class Constructor {
    String name;

    public Constructor() {
        this("pratibha");
    }

    public Constructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        System.out.println(constructor.name);
    }
}
