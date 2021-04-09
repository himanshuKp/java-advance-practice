/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 08/04/21, 5:38 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.linkedlist;

public class Node {

    public String data;
    private Node next;

    public Node(String data) {
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
