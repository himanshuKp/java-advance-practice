/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/06/21, 8:38 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

class GrandParent {
    public void print(){
        System.out.println("Grandparent print().");
    }
}

class Parent extends GrandParent {
    public void print(){
        super.print();
        System.out.println("Parent print().");
    }
}

class Child extends Parent {
    public void print(){
        super.print();
        System.out.println("Child print().");
    }
}

public class GrandParentTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}
