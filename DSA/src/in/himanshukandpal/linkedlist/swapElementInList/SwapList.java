/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 15/04/21, 9:37 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.linkedlist.swapElementInList;

public class SwapList {

    public Node head;

    public SwapList(){
        this.head = null;
    }

    public static void main(String[] args) {

    }

    public void addToHead(int data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead != null){
            this.head.setNext(currentHead);
        }
    }

}
