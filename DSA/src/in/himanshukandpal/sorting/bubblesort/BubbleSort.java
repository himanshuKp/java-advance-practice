/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 10/06/21, 10:26 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sorting(int inputArray[]){
        boolean swapping = true;
        while (swapping){
            swapping = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i]<inputArray[i+1]){
                    System.out.println(String.format("Swapping pair %d, %d", inputArray[i], inputArray[i+1]));
                    System.out.println("-".repeat(5) + " Before swapping " + Arrays.toString(inputArray));
                    Swap.swap(inputArray, i, i+1);
                    System.out.println("-".repeat(5) + " After swapping " + Arrays.toString(inputArray));
                    swapping = true;
                }
            }
        }

        return inputArray;
    }
    
    public static void main(String[] args) {
        int[] count_backwards = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Starting BubbleSort on reverse sorted: " + Arrays.toString(count_backwards));
        BubbleSort.sorting(count_backwards);
        System.out.println("After sorting: "+Arrays.toString(count_backwards));
    }
}
