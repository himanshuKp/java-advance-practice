/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 13/04/21, 7:04 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.trywithresource;

public class MyWorker implements AutoCloseable{

    MyWorker(){
        System.out.println("Creating the resource");
    }

    public void doSomething(){
        System.out.println("Doing something.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");
    }
}
