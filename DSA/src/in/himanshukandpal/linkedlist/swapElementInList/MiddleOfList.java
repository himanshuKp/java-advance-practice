/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 17/04/21, 3:40 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */
//Consider finding the middle node of a linked list.
package in.himanshukandpal.linkedlist.swapElementInList;

public class MiddleOfList {
    public Node head;

    public MiddleOfList() {
         this.head = null;
    }

    public static void main(String[] args) {
        MiddleOfList list = new MiddleOfList();
        for (int i = 0; i <= 10; i++) {
            list.addToTail(i);
        }
        list.printList();
        Node node = findMiddleOfList(list);
        System.out.println("Middle element of list: "+node.data);
    }

    private static Node findMiddleOfList(MiddleOfList list) {
        Node firstPointer = list.head;
        Node secondPointer = list.head;

        while (firstPointer != null){
            firstPointer = firstPointer.getNext();
            if (firstPointer != null){
                firstPointer = firstPointer.getNext();
                secondPointer = secondPointer.getNext();
            }
        }
        return secondPointer;
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
        Node currentNode = this.head;
        if(currentNode == null){
            this.head = newTail;
        }else {
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newTail);
        }
    }
}
