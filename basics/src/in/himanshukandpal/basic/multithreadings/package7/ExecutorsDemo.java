/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/09/21, 1:39 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class UploadResult extends Thread {
    @Override
    public void run() {
        System.out.println("Upload successfull");
    }
}

public class ExecutorsDemo{
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        UploadResult result1 = new UploadResult();
        UploadResult result2 = new UploadResult();
        service.execute(result1);
        service.execute(result2);
        service.shutdown();
    }
}
