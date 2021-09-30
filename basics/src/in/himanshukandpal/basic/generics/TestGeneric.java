/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/09/21, 11:10 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.generics;

public class TestGeneric {

    // define printArray method

    public static void main(String[] args) {

        Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
        Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
        Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
        TestGeneric tg = new TestGeneric();
        tg.printArray(arrInteger);
        tg.printArray(arrChar);
        tg.printArray(arrDouble);

    }

    private void printArray(Object[] arrInteger) {
        for(Object t:arrInteger){
            System.out.println(t);
        }
    }

}
