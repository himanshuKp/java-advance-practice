/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 15/04/21, 9:44 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.linkedlist.swapElementInList;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
