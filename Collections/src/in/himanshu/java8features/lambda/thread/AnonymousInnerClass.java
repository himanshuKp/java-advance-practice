package in.himanshu.java8features.lambda.thread;

public class AnonymousInnerClass {
    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Child Thread");
//                }
//            }
//        });
//        OR
//        using lambda
        Thread t = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        });
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
