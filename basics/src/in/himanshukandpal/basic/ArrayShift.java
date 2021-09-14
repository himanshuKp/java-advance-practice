/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 14/09/21, 6:35 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

class MakeShift {
    public static void shift(char[] elements, int position, char element) {
        for (int i = elements.length-1; i >= position ; i--) {
            elements[i]=elements[i-1];
        }
        elements[position-1] = element;
    }
}

class ArrayShift {
    public static void main(String[] args) {
        char[] elements = new char[6];
        elements[0]='A';
        elements[1]='B';
        elements[2]='C';
        elements[3]='D';
        elements[4]='E';

        MakeShift.shift(elements, 3, 'J');
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
