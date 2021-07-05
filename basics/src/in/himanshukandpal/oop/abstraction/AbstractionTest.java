/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 05/07/21, 9:51 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.oop.abstraction;

abstract class Shape {
    String color;

//    these are abstract methods
    abstract double area();
    public abstract String toString();

//    abstract class can have constructor
    public Shape(String color) {
        System.out.println("Shape constructor called.");
        this.color = color;
    }

//    this is a concrete method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called.");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is: "+super.getColor()+" and area is: "+area();
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor called.");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is: "+super.getColor()+" and area is: "+area();
    }
}

public class AbstractionTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle("Red", 2.2);
        Shape shape2 = new Rectangle("Yellow", 2, 4);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}
