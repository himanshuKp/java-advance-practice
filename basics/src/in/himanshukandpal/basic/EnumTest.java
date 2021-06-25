/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/06/21, 11:21 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class EnumTest {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
/*
* An enum just like class have methods and attributes. The only difference are
* enum constants are public, static and final
*
* An enum cannot be used to create objects. and it cannot extend other classes. (but it can implement interfaces)
*
* */
    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println(level);
    }
}
