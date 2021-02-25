package com.himanshu.staticinner;

public class Outer {

    static void f1(){
        System.out.println("Outer static method");
    }

    static class Inner {
        static void f2(){
            System.out.println("Inner static method");
        }

        void f3(){
            System.out.println("Non static method in static class");
        }
    }

    public static void main(String[] args) {
        Outer.f1();

//        Both the below methods will work
//        Outer.Inner.f2();
        Inner.f2();

        Inner inner = new Inner();
        inner.f3();
    }

}
