/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 07/07/21, 1:14 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectionTest2{
    private String string;

    public ReflectionTest2() {
        string = "Reflection test";
    }

//    public method with no argument
    public void method1(){
        System.out.println("The string is: "+string);
    }

//    public method with int argument
    public void method2(String n){
        System.out.println("The parameter value is: "+n);
    }

//    private method with no argument
    private void method3(){
        System.out.println("Reflection class private method.");
    }
}

class Middleware {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        ReflectionTest2 test2 = new ReflectionTest2();

        Class cls = test2.getClass();
        System.out.println("The class name is: "+cls);

//        getting the constrctor of the class
        Constructor constructor = cls.getConstructor();
        System.out.println("Construct name is: "+constructor.getName());

//        get declared methods
        Method[] methods = cls.getMethods();
        for (Method method: methods){
            System.out.println(method.getName());
        }

//        create object of desired method by providing the method name and
//        parameter class as argument to the getDeclaredMethod.
        Method method2 = cls.getDeclaredMethod("method2", String.class);
        method2.invoke(test2 , "10");

        Field field = cls.getDeclaredField("string");
        field.setAccessible(true);
        System.out.println("Field value is: "+field.getName());


    }
}
