package com.himanshu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {
        CheckProcessorTask[] cpt = {
                new CheckProcessorTask("ATM"),
                new CheckProcessorTask("Bank"),
                new CheckProcessorTask("Mobile"),
                new CheckProcessorTask("Web")
        };

//        create fixed thread pool
        ExecutorService service = Executors.newFixedThreadPool(4);

        for (CheckProcessorTask checkProcessorTask: cpt){
            service.submit(checkProcessorTask);
        }

        service.shutdown();
    }
}
