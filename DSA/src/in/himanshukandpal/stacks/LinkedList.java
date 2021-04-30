/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/04/21, 12:27 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.stacks;

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
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data){
        Node tail = this.head;
        if(tail == null){
            this.head = new Node(data);
        } else {
            while (tail.getNextNode()!=null){
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    public String removeHead(){
        Node removeHead = this.head;
        if(removeHead == null){
            return null;
        } else {
            this.head = removeHead.getNextNode();
            return removeHead.data;
        }
    }

    public String printList(){
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null){
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        return output;
    }
}
