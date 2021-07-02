/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 02/07/21, 3:57 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// class whose object is to be created
public class ReflectionTest {
//    creating a private field
    private String s;

//    creating a public constructor
    public ReflectionTest() {
        s = "ReflectionForTest";
    }

//    creating a public method with no arguments
    public void method1(){
        System.out.println("The string is: "+s);
    }

//    creating a public method with int as argument
    public void method2(int n){
        System.out.println("The number is: "+n);
    }

    private void method3(){
        System.out.println("Private method invoked.");
    }
}

class ReflectionTestDriver{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
//        creating object whose property is to be invoked
        ReflectionTest obj = new ReflectionTest();

//        creating class object from the object using getclass method
        Class cls = obj.getClass();
        System.out.println("The name of the class is: "+cls);

//        getting the constructor of the class through the object of the object
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is: "+constructor.getName());

        System.out.println("The public method of class are: ");
        Method[] methods = cls.getMethods();

        for (Method method: methods)
            System.out.println(method.getName());

//        create object of desired method by providing the method name and
//        parameter class as arguments to the getDeclaredMethod
        Method method2 = cls.getDeclaredMethod("method2", int.class);
//        invokes the method at runtime
        method2.invoke(obj, 30);

//        create object of the desired field by providing
//        the name of field as argument to the
//        getDeclaredFields methods
        Field field = cls.getDeclaredField("s");

//        allow the object to access the field irrespective of the access
//        specifier used with the field
        field.setAccessible(true);

//        takes object and the new value to be assigned
//        to the field as arguments
        field.set(obj, "JAVA");

//        creates object of desired method by providing the
//        method name as arguments to the getDeclaredMethod
        Method method1 = cls.getDeclaredMethod("method1");

//        invoke the method at runtime
        method1.invoke(obj);

//        create object of the desired method by providing
//        the name of method as argument to the
//        getDeclaredMethod method
        Method method3 = cls.getDeclaredMethod("method3");

//        allows the object to access the method irrespective
//        of the access specifier used with the method
        method3.setAccessible(true);

//        invoke the method at runtime
        method3.invoke(obj);
    }
}