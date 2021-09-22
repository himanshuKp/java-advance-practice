/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/09/21, 4:57 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.exceptions;

class MyDivException extends Exception{
    public MyDivException(String message) {
        super(message);
    }
}

class ExceptionDemo {

    public static void divide(int x, int y) throws MyDivException {

            if (y == 0)
                throw new MyDivException("The divisor should not be zero");
            int z = x / y;
            System.out.println(z);
    }

    public static void main(String[] args) {
        try {
            ExceptionDemo.divide(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
