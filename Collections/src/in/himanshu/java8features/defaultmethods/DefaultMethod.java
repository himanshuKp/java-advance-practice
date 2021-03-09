/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/03/21, 11:38 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.defaultmethods;

public interface DefaultMethod {

//  provide default method which can be called, if it is not defined in extending class
    default void welcome(){
        System.out.println("Default method in interface");
    }
}
