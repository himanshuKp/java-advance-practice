/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/07/21, 5:49 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.sorting.bubblesort1;

public class Swapping {
    public static void swap(int[] input_array, int firstElementIndex, int secondElementIndex){
        int tempVariable = input_array[firstElementIndex];
        input_array[firstElementIndex] = input_array[secondElementIndex];
        input_array[secondElementIndex] = tempVariable;
    }
}
