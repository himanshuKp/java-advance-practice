/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/09/21, 1:50 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class UploadResult implements Runnable{
    public String taskname;

    public UploadResult(String name) {
        this.taskname = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (start) " + taskname);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " (ends) " + taskname);
    }
}

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        int totalTasks = 8;
        for (int i = 0; i < totalTasks; i++) {
            UploadResult result = new UploadResult("UploadResult: "+i);
            service.execute(result);
        }
        service.shutdown();
        while (!service.isTerminated()){}
        System.out.println("Finished all threads");
    }
}
