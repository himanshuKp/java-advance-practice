/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 13/04/21, 7:06 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.trywithresource;

public class Test {
    public static void main(String[] args) {
        MyWorker worker = new MyWorker();
        try(worker){
            worker.doSomething();
        }catch (Exception e){

        }
    }
}
