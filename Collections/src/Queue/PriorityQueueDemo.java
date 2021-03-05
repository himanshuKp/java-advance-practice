/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 05/03/21, 4:32 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

//        peek() throws null if the queue is empty
        System.out.println(queue.peek());

//        stores element is queue, maintaines order
        for (int i=10;i<20;i++){
            queue.offer(i);
        }

        System.out.println("After offer(o): "+queue);

//        once we remove any element, the order will get disturbed
//        poll() removes the top element
        queue.poll();

        System.out.println("After poll(): "+queue);

//        peek() gives top element value, not remove it
        System.out.println("After peek(): "+queue.peek());

//        element() throws NoSuchElementException if queue is empty
//        gives top element of queue
        System.out.println("After element(): "+queue.element());

//        remove() remove top element, throws NoSuchElementException if queue is empty
        System.out.println("After remove(): "+queue.remove());
    }
}
