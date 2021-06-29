/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/06/21, 4:05 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.challenge.complex;

public class ComplexNumber {
//    variables to hold real and imaginary part of complex number
    int real, image;

//    constructor which will be used while creating complex number
    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public void show(){
        System.out.println(this.real+" +i"+this.image);
    }

    public static ComplexNumber add(ComplexNumber number1, ComplexNumber number2){
//        creating blank complex number to store result
        ComplexNumber res = new ComplexNumber(0,0);

//        adding real parts of both complex numbers
        res.real = number1.real + number2.real;

//        adding imaginary part
        res.image = number1.image + number2.image;

//        returning result
        return res;
    }

    public static void main(String[] args) {

//        creating two complex numbers
        ComplexNumber c1 = new ComplexNumber(4,5);
        ComplexNumber c2 = new ComplexNumber(10, 5);

        System.out.print("First complex number: ");
        c1.show();

        System.out.print("Second complex number: ");
        c2.show();

//        calling add() to perform addition
        ComplexNumber res = add(c1, c2);

//        displaying addition
        System.out.print("Addition is: ");
        res.show();
    }
}
