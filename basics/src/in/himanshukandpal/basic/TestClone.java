/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/06/21, 8:26 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

class Test implements Cloneable{
    int a;
    int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test Cloning(){
        try {
            return (Test) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return this;
        }
    }

}

public class TestClone {
    public static void main(String[] args) {
        Test obj1 = new Test(1,2);
        Test obj2 = obj1.Cloning();
        obj1.a = 3;
        obj1.b = 4;
        System.out.println("Object2 is the clone of Object1");
        System.out.println("obj1.a = "+obj1.a+ " obj1.b = "+obj1.b);
        System.out.println("obj2.a = "+obj2.a+ " obj2.b = "+obj2.b);
    }
}
