/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 15/04/21, 9:44 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.linkedlist.swapElementInList;

public class Node {
    public Integer data;
    private Node next;

    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
