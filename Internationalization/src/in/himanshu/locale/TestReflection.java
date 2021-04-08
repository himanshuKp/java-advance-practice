/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 08/04/21, 2:23 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.locale;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println(Class.forName(LocaleMethods.class.getName()));   //output: class in.himanshu.locale.LocaleMethods
        Class myCLass = Class.forName(LocaleMethods.class.getName());
        System.out.println(myCLass.getName());  //output: in.himanshu.locale.LocaleMethods
        Constructor[] constructor =  myCLass.getConstructors();
        System.out.println(Arrays.toString(constructor));
        System.out.println(Arrays.toString(myCLass.getMethods()));
    }
}
