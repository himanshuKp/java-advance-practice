/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 31/03/21, 4:15 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.sorting.bubblesort;

public class BubbleSortDemo1 {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+", ");
        }

    }

    public static void swap(int[] array, int firstElement, int secondElement){
        if(firstElement == secondElement){
            return;
        }

        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
