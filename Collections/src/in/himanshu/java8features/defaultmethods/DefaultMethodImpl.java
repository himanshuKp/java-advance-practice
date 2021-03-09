/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 11:39 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.defaultmethods;

public class DefaultMethodImpl implements DefaultMethod{

//  provide custom implementation of default methods in interface
    @Override
    public void welcome() {
        System.out.println("Default method in impl class");
    }
}
