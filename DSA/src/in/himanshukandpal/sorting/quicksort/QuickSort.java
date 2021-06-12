/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/06/21, 12:02 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.sorting.quicksort;

import in.himanshukandpal.sorting.bubblesort.Swap;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] inputArray = {55,99,10,5,77,64,21,43,86};
        QuickSort qs = new QuickSort();
        System.out.println("Sorting the array: "+ Arrays.toString(inputArray));
        qs.quickSort(inputArray);
        System.out.println("After sorting: "+Arrays.toString(inputArray));
    }

    private int[] quickSort(int[] inputArray) {
        if (inputArray.length <= 1){
            return inputArray;
        }
        return quickSort(inputArray, 0, inputArray.length - 1);
    }

    private int[] quickSort(int[] inputArray, int start, int end) {
        if (end > start){
            int partition = partition(inputArray, start, end);
            if (start < partition){
                quickSort(inputArray, start, partition);
            }
            if (partition + 1 < end){
                quickSort(inputArray, partition + 1, end);
            }
        }
        return inputArray;
    }

    private int partition(int[] inputArray, int start, int end) {
        int pivot = inputArray[Math.floorDiv((start+end), 2)];
        while (start < end){
            while (inputArray[start] < pivot){
                start++;
            }
            while (inputArray[end] > pivot){
                end--;
            }
            if (start < end){
                Swap.swap(inputArray, start, end);
            }
        }
        return start;
    }

}
