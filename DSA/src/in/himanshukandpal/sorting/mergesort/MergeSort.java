/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 11/06/21, 3:20 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.sorting.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {20,19,18,17,16,15,14,13,12,11};
        MergeSort sorter = new MergeSort();
        System.out.println(Arrays.toString(sorter.sort(arr)));
    }

    private int[] sort(int[] arr) {
//        calculate array length
        int length = arr.length;
        if (length <= 1){
            return arr; //there is nothing ot sort
        }
//        calculate mid index
        int mid = Math.floorDiv(length, 2);
//        divide array in two halfs
        int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arr, mid, length);
        return merge(sort(leftArray), sort(rightArray));
    }

    private int[] merge(int[] left, int[] right) {
//        create a merged array of length equal to sum of left and right array
        int[] merged = new int[left.length + right.length];
        int leftPosition = 0;
        int rightPosition = 0;
        int currentIndex = 0;
        while (left.length > leftPosition && right.length > rightPosition){
            if (left[leftPosition] < right[rightPosition]){
                merged[currentIndex] = left[leftPosition];
                leftPosition++;
            } else {
                merged[currentIndex] = right[rightPosition];
                rightPosition++;
            }
            currentIndex++;
        }
        System.arraycopy(left, leftPosition, merged, currentIndex, left.length - leftPosition);
        System.arraycopy(right, rightPosition, merged, currentIndex, right.length - rightPosition);
        return merged;
    }
}
