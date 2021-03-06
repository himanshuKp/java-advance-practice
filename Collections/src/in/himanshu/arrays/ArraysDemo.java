package in.himanshu.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] intArray = {40,20,30,10};
        
//        Before sort
        System.out.print("Before sorting: ");
        for (int element: intArray) {
            System.out.print(element+", ");
        }

        Arrays.sort(intArray);

        System.out.print("\nAfter sorting: ");
        for (int element: intArray) {
            System.out.print(element+", ");
        }

        List<Integer> intList = Arrays.asList(intArray);
        System.out.println("Integer list: "+intList);
    }
}
