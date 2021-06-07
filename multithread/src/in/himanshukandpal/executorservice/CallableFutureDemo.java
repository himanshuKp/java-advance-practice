/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 07/06/21, 1:52 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.executorservice;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<Integer> future = executorService.submit(new Task());

        try {
            Integer result = future.get();
            System.out.println("Result from the task is: "+result);
        } catch (InterruptedException | ExecutionException exception){
            exception.printStackTrace();
        }
    }

    private static class Task implements Callable<Integer> {
        @Override
        public Integer call() {
            return new Random().nextInt();
        }
    }
}
