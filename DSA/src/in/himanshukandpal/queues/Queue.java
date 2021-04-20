/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/04/21, 12:02 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.queues;

public class Queue {
    private static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    private final int maxSize;
    public LinkedList queue;
    public int size;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int defaultMaxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = defaultMaxSize;
    }

    public void enqueue(String data){
        this.queue.addToTail(data);
        this.size += 1;

        System.out.println("Added "+data+"! Queue size is now "+this.size);
    }

    public static void main(String[] args) {
        Queue coffeeOrder = new Queue();
        System.out.println("coffeeOrder queue has " + coffeeOrder.size + " orders.");
        coffeeOrder.enqueue("latte");
        coffeeOrder.enqueue("espresso");
        coffeeOrder.enqueue("cappuccino");
    }
}
