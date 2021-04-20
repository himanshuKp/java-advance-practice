/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/04/21, 11:41 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.queues;

public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead!= null){
            this.head.setNext(currentHead);
        }
    }

    public void addToTail(String data){
        Node tail = this.head;
        if(tail == null){
            this.head = new Node(data);
        } else {
            while (tail.getNext() != null){
                tail = tail.getNext();
            }
            tail.setNext(new Node(data));
        }
    }

    public String removeHead(){
        Node removeHead = this.head;
        if(removeHead == null){
            return null;
        }
        this.head = removeHead.getNext();
        return removeHead.data;
    }

    public String toString(){
        Node currentHead = this.head;
        String output = "<head> ";
        while (currentHead != null){
            output += currentHead.data + " ";
            currentHead = currentHead.getNext();
        }
        output += "<tail>";
        return output;
    }
}
