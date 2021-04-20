/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/04/21, 12:02 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.queues;

public class Queue {
    public LinkedList queue;
    public int size;

    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("This queue has "+queue.size+" nodes.");
    }
}
