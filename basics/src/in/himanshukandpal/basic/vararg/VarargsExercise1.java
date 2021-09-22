/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/09/21, 10:03 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.vararg;

public class VarargsExercise1 {
    public void displayList(int... input){
        System.out.println("All the items in the list: ");
        for (int data:input){
            System.out.println(data);
        }
        System.out.println("-".repeat(10));
    }
    public void maxOfList(int... input){
        int maxInput = 0;
        for (int data:input){
            if (maxInput < data){
                maxInput = data;
            }
        }
        System.out.println("Max item of list: "+maxInput);
    }
    public static void sortList(int... input){

            for (int j = 0;j<input.length-1;j++){
                for (int i = 0;i<input.length-1;i++){
                    if (input[i]>input[i+1]){
                        int temp = 0;
                        temp = input[i];
                        input[i] = input[i+1];
                        input[i+1] = temp;
                    }
                }
            }
        for (int element: input){
            System.out.print(element+", ");
        }
    }
    public void averageList(int... input){}

    public static void main(String[] args) {
        int inputArray[] = {22,11,55,33,00,88};
        VarargsExercise1.sortList(inputArray);
    }
}
