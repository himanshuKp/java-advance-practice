/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 19/04/21, 4:40 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.searchAlgo;

public class BinarySearchImpl {
    public static void main(String[] args) {
        int[] searchable = {1,2,7,9,22,28,51,62,78,99};
        int target = 22;

        System.out.println(search(searchable, target));
    }

    private static int search(int[] searchable, int target) {
        int left = 0;
        int right = searchable.length;
        while (left < right){
            int mid = Math.floorDiv(left + right, 2);
            int midValue = searchable[mid];

            if(midValue == target){
                return mid;
            } else if (midValue < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}
