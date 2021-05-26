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
        ClassExample example = new ClassExample();
        example.getFour();
        example.getSix();
    }
}
