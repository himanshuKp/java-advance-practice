/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 10/06/21, 10:24 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.sorting.bubblesort;

public class Swap {
    public static void swap(int[] inputArray, int firstElementIndex, int secondElementIndex){
        int temp = inputArray[secondElementIndex];
        inputArray[secondElementIndex] = inputArray[firstElementIndex];
        inputArray[firstElementIndex] = temp;
    }
}
