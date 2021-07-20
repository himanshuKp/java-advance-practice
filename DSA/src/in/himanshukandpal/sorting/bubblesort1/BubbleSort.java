/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/07/21, 5:28 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.sorting.bubblesort1;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sorting(int[] input_array) {
        boolean swapping = true;
        while (swapping){
            swapping = false;
            for (int i = 0;i<input_array.length-1;i++){
                if (input_array[i]>input_array[i+1]){
                    System.out.println(String.format("Swapping elements: %d, %d", input_array[i], input_array[i+1]));
                    System.out.println("-".repeat(5)+" Before Swapping: "+Arrays.toString(input_array));
                    Swapping.swap(input_array, i, i+1);
                    System.out.println("-".repeat(5)+" After Swapping: "+Arrays.toString(input_array));
                    swapping = true;
                }
            }
        }
        return input_array;
    }
}

class Main {
    public static void main(String[] args) {
        int[] count_backwards = {9,8,7,6,5,4,3,2,1};
        System.out.println("Starting bubble sort on reverse order: "+ Arrays.toString(count_backwards));
        BubbleSort.sorting(count_backwards);
        System.out.println("After sorting: "+Arrays.toString(count_backwards));
    }
}
