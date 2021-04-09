/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 08/04/21, 5:43 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        LinkedList seasons = new LinkedList();
        seasons.addToHead("summer");
        seasons.addToHead("spring");
        seasons.printList();
        seasons.addToTail("winter");
        seasons.addToTail("fall");
        seasons.printList();
        seasons.removedHead();
        seasons.printList();
    }

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead!=null){
            this.head.setNext(currentHead);
        }
    }

    public void addToTail(String data){
        Node tail = this.head;
        if(tail == null){
            this.head = new Node(data);
        }else {
            while (tail.getNext()!= null){
                tail = tail.getNext();
            }
            tail.setNext(new Node(data));
        }
    }

    public String removedHead(){
        Node removedHead = this.head;
        if(removedHead == null){
            return null;
        } else {
            this.head = removedHead.getNext();
            return removedHead.data;
        }
    }

    public String printList() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }
}
