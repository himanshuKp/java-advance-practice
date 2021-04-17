/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 17/04/21, 10:47 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */
//Create a method that returns the nth last element of a singly linked list.
package in.himanshukandpal.linkedlist.swapElementInList;

public class IterateList {

    public Node head;

    public IterateList() {
        this.head = null;
    }

    public static void main(String[] args) {
        IterateList list = new IterateList();
        for (int i = 0; i < 10; i++) {
            list.addToTail(i);
        }
        list.printList();
        int position = 6;
        Node nthNode = list.nthElement(list, position);
        System.out.println(position+"th Element: "+nthNode.data);
    }

    private Node nthElement(IterateList list, int position) {
        Node current = null;
        Node tailSeeker = list.head;
        int count = 0;

        while (tailSeeker != null){
            tailSeeker = tailSeeker.getNext();
            if(count >= position){
                if(current == null){
                    current = list.head;
                }
                current = current.getNext();
            }
            count ++;
        }
        return current;
    }

    private void printList() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null){
            output += currentNode.data + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
    }

    private void addToTail(int data) {
        Node newTail = new Node(data);
        Node tail = this.head;
        if(tail == null){
            this.head = newTail;
        } else {
            while (tail.getNext() != null){
                tail = tail.getNext();
            }
            tail.setNext(newTail);
        }
    }
}
