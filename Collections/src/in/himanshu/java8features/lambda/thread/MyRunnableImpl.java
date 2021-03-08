package in.himanshu.java8features.lambda.thread;

public class MyRunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
        }
    }
}
