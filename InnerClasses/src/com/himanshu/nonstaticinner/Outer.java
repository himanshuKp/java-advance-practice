package com.himanshu.nonstaticinner;

public class Outer {

    private static int x=50;
    private int y;

    public Outer(int y) {
        this.y = y;
    }

    void f1(){
        System.out.println("Outer classes non static method");
    }

    private class Inner {
        private int y;

        public Inner(int y) {
            this.y = y;
        }

        void f2(){
            System.out.println("Outer class x: "+Outer.x);
            System.out.println("Outer class y:"+Outer.this.y);
            System.out.println("Inner class y:"+this.y);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer(10);
        outer.f1();

        Inner inner = outer.new Inner(20);
        inner.f2();
    }

}
