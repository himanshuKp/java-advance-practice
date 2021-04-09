/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 08/04/21, 5:43 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.linkedlist;

public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead!=null){
            this.head.setNext(newHead);
        }
    }

    public static void main(String[] args) {

    }
}
