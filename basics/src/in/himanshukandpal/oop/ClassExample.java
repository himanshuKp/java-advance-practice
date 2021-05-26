/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/05/21, 9:30 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.oop;

public class ClassExample {
    private int score;

    public void getFour(){
        score = score + 4;
    }

    public void getSix(){
        score = score + 6;
    }

    public int getScore(){
        return score;
    }

    public static void main(String[] args) {
//        ClassExample example = new ClassExample();
//        example.getFour();
//        example.getSix();

        Test ob1 = new Test(1);
        Test ob2 = new Test(1);
        Test ob3 = ob1;

        System.out.println(ob1 == ob2);
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1==ob3);
        System.out.println(ob1.equals(ob3));
    }
}
