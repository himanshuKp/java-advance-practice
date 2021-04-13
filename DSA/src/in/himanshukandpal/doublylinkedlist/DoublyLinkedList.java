/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/04/21, 5:59 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.doublylinkedlist;

public class DoublyLinkedList {

    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        DoublyLinkedList subway = new DoublyLinkedList();
        subway.addToHead("Times Square");
        subway.addToHead("Grand Central");
        subway.addToHead("Central Park");

        subway.printList();

        subway.addToTail("Penn Station");
        subway.addToTail("Wall Street");
        subway.addToTail("Brooklyn Bridge");

        subway.printList();

        subway.removeHead();
        subway.removeTail();

        subway.printList();

        subway.removeByData("Times Square");

        subway.printList();
    }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        if(currentHead != null){
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;
        if(this.tail == null){
            this.tail = newHead;
        }
    }

    public void addToTail(String data){
        Node newTail = new Node(data);
        Node currentTail = this.tail;
        if(currentTail != null){
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;
        if(this.head == null){
            this.head = newTail;
        }
    }

    public String removeHead(){
        Node removedHead = this.head;
        if(removedHead == null){
            return null;
        }
        this.head = removedHead.getNextNode();
        if(this.head != null){
            this.head.setPreviousNode(null);
        }
//        check if the there is only one node in list
        if(removedHead == this.tail){
//            removedTail();
        }
        return removedHead.data;
    }

    public String removeTail(){
        Node removedTail = this.tail;

        if(removedTail == null){
            return null;
        }
        this.tail = removedTail.getPreviousNode();

        if(this.tail != null){
            this.tail.setNextNode(null);
        }
        if(removedTail == this.head){
            removeHead();
        }
        return removedTail.data;
    }

    public Node removeByData(String data){
        Node removedNode = null;
        Node currentNode = this.head;
        while (currentNode!=null){
            if(currentNode.data == data){
                removedNode = currentNode;
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        if(removedNode == null){
            return null;
        }
        if(removedNode == this.head){
            removeHead();
        }else if(removedNode == this.tail){
            removeTail();
        }else {
            Node nextNode = removedNode.getNextNode();
            Node previousNode = removedNode.getPreviousNode();
            nextNode.setPreviousNode(previousNode);
            previousNode.setNextNode(nextNode);
        }
        return removedNode;
    }

    public String printList(){
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null){
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }
}
