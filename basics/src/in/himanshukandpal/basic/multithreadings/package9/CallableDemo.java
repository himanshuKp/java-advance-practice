/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/09/21, 2:03 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class UploadResult implements Callable<Boolean>{
    private String taskName;

    public UploadResult(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public Boolean call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" (start) "+taskName);
        Boolean retValue = null;
        try{
            Thread.sleep(2000);
            retValue = Boolean.TRUE;
        } catch (Exception e){
            System.out.println(e.getMessage());
            retValue = Boolean.FALSE;
        }
        return retValue;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        UploadResult uploadResult = new UploadResult("java");
        Future<Boolean> result = service.submit(uploadResult);
        try {
            System.out.println("Upload complete: "+result.get());
        } catch (Exception e){
            System.out.println("Upload failed: "+e.getMessage());
        }
        service.shutdown();
    }
}
