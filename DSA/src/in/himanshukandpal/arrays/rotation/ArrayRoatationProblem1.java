/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/04/21, 3:17 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.arrays.rotation;

/*
* Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
* 1,2,3,4,5,6,7
* Rotation of the above array by 2 will make array
* 3,4,5,6,7,1,2
* METHOD 1 (Using temp array)
    Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
    1) Store the first d elements in a temp array
       temp[] = [1, 2]
    2) Shift rest of the arr[]
       arr[] = [3, 4, 5, 6, 7, 6, 7]
    3) Store back the d elements
       arr[] = [3, 4, 5, 6, 7, 1, 2]
* Time complexity : O(n)
* Auxiliary Space : O(d)
* METHOD 2 (Rotate one by one)
    leftRotate(arr[], d, n)
    start
      For i = 0 to i < d
        Left rotate all elements of arr[] by one
    end
* To rotate by one, store arr[0] in a temporary variable temp, move arr[1] to arr[0],
* arr[2] to arr[1] …and finally temp to arr[n-1]
    Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
    Rotate arr[] by one 2 times
    We get [2, 3, 4, 5, 6, 7, 1] after first rotation
    and [ 3, 4, 5, 6, 7, 1, 2] after second rotation.
    Below is the implementation of the above approach :
* */

public class ArrayRoatationProblem1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        leftRotate(array, 2, array.length);
        printFinalArray(array, array.length);
    }

    private static void printFinalArray(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    //    function to ratate the array of size length by position of i places
    private static void leftRotate(int[] array, int i, int length) {
        for (int j = 0; j < i; j++) {
            leftRotateByOne(array, length);
        }
    }

//    function to rotate the array by one place to left
    private static void leftRotateByOne(int[] array, int length) {
        int temp = 0;
        temp = array[0];
        for (int i = 0; i < length-1; i++) {
            array[i]=array[i+1];
        }
        array[length-1] = temp;
    }
}
