/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/05/21, 12:05 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.hashmap;

public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String key, String value){
        Node newNode = new Node(key, value);
        Node currentHead = this.head;
        this.head = newNode;
        if(currentHead!=null){
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String key, String value){
        Node tail = this.head;
        if(tail == null){
            this.head = new Node(key, value);
        } else {
            while (tail.getNextNode() != null){
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(key, value));
        }
    }

    public void removeHead(){
        Node removeHead = this.head;
        if(removeHead == null){
            return;
        }
        this.head = removeHead.getNextNode();
    }
}
