/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 06/06/21, 5:04 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.heap;

import java.util.ArrayList;
import java.util.Random;

public class MinHeap {

    public ArrayList<Integer> heap;
    public int size;

    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.heap.add(null);
        this.size = 0;
    }

//    add() to heap
    public void add(int value){
        this.heap.add(value);
        System.out.println(this.heap);
        this.size++;
        System.out.println("Adding "+value);
        this.bubbleUp();
    }

    private void bubbleUp() {
        int current = this.size;
        while (current > 1 && (this.heap.get(current) < this.heap.get(this.getParent(current)))){
            System.out.println("Swap Index: "+current+ " with parent "+this.getParent(current));
            System.out.println(this.heap);
            this.swap(current, this.getParent(current));
            current = this.getParent(current);
        }
    }

    private void swap(int current, int parent) {
        int temp = this.heap.get(parent);
        this.heap.set(parent, this.heap.get(current));
        this.heap.set(current, temp);
    }

    public int getParent(int value){
        return value / 2;
    }

    public int getLeft(int value){
        return value * 2;
    }

    public int getRight(int value){
        return (value * 2) + 1;
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            System.out.println("-".repeat(10));
            minHeap.add(random.nextInt(40));
        }

        System.out.println("-".repeat(10));
        System.out.println("Building up: "+minHeap.heap);
       /* minHeap.add(10);
        minHeap.add(13);
        minHeap.add(21);
        minHeap.add(61);
        minHeap.add(22);
        minHeap.add(23);
        minHeap.add(99);

        System.out.println("Heap Tree: "+minHeap.heap);

//        display parent, left and right child indices of currentIndex
        int currentIndex = 3;
        int parentIndex = minHeap.getParent(currentIndex);
        int leftChild = minHeap.getLeft(currentIndex);
        int rightChild = minHeap.getRight(currentIndex);
        System.out.println("----------");
        System.out.println("Let's look at index: "+currentIndex);
        System.out.println("Parent index: "+parentIndex);
        System.out.println("Left index: "+leftChild);
        System.out.println("Right index: "+rightChild);

//        display the parent, left and right child value
        System.out.println("-".repeat(10));
        System.out.println("Parent value: "+minHeap.heap.get(parentIndex));
        System.out.println("Left value: "+minHeap.heap.get(leftChild));
        System.out.println("Right value: "+minHeap.heap.get(rightChild));*/
    }
}
