/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 15/04/21, 9:37 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.linkedlist.swapElementInList;

import org.jetbrains.annotations.NotNull;

public class SwapList {

    public Node head;

    public SwapList(){
        this.head = null;
    }

    public static void main(String[] args) {
        SwapList testList = new SwapList();
        for (int i = 0; i <= 10; i++) {
            testList.addToTail(i);
        }

        testList.printList();
        swapNodes(testList, 3, 7);
        testList.printList();
    }

    public static void swapNodes(@NotNull SwapList list, Integer data1, Integer data2){
        System.out.println("Swapping "+data1+" with "+data2);
        Node node1Prev = null;
        Node node2Prev = null;
        Node node1 = list.head;
        Node node2 = list.head;

        if(data1 == data2){
            System.out.println("Elements are the same, no swap to be made");
            return;
        }

        while (node1 != null){
            if (node1.data == data1){
                break;
            }
            node1Prev = node1;
            node1 = node1.getNext();
        }

        while (node2 != null){
            if(node2.data == data2){
                break;
            }
            node2Prev = node2;
            node2 = node2.getNext();
        }

        if(node1 == null || node2 == null){
            System.out.println("Swap not possible - one or more element is not in the list.");
            return;
        }

        if (node1Prev == null){
            list.head = node2;
        }else {
            node1Prev.setNext(node2);
        }

        if(node2Prev == null){
            list.head = node1;
        }else {
            node2Prev.setNext(node1);
        }

        Node temp = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(temp);
    }

    public void addToHead(Integer data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead != null){
            this.head.setNext(currentHead);
        }
    }

    public void addToTail(Integer data){
        Node tail = this.head;
        if(tail == null){
            this.head = new Node(data);
        }else {
            while (tail.getNext() != null){
                tail = tail.getNext();
            }
            tail.setNext(new Node(data));
        }
    }

    public Integer removeHead(){
        Node removedHead = this.head;
        if(removedHead == null){
            return null;
        }else {
            this.head = removedHead.getNext();
            return removedHead.data;
        }
    }

    public String printList(){
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null){
            output += currentNode.data + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

}
