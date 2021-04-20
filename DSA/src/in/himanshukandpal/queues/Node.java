/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/04/21, 11:37 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.queues;

public class Node {
    public String data;
    private Node prev;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
