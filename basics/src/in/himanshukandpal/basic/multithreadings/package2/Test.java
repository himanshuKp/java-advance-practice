/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/09/21, 4:07 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package2;

class UploadResult implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable interface");
    }
}

public class Test {
    public static void main(String[] args) {
        UploadResult result = new UploadResult();
        Thread currentObj = new Thread(result);
        currentObj.start();
    }
}
