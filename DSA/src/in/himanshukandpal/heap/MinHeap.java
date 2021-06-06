/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 06/06/21, 5:04 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.heap;

import java.util.ArrayList;

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
        System.out.println("Restoring heap condition...");
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        System.out.println(minHeap.heap);

        minHeap.add(42);
    }
}
