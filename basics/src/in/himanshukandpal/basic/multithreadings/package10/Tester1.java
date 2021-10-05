/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/10/21, 12:21 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package10;

/*
class StringTest {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "a", s3 = "b";
        s1.toLowerCase();
        s3.replace('b', 'a');
        System.out.print((s1.equals(s2)) + "," + (s2.equals(s3)));
    }
}*/

/*
class SuperClass {
    private void displayName() {
        System.out.println("Super Class");
    }
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        superClass.displayName();
    }
}

class SubClass extends SuperClass {
    private void displayName() {
        System.out.println("SubClass is a type of SuperClass");
    }
}*/

/*
class Person{
    public Person(String name){
        System.out.println(name);
    }
}

class Student extends Person{
    public Student(){          //line 8
        System.out.println("Student");
    }
    public static void main(String[] args) { // line 11
        new Person("Bob");
    }
}*/

/*
abstract class Person1 {
    public final void display(){
        System.out.println("Display method in Person");
    }

    public static void main(String[] args){
        Person1 person = new Student1();        //line 6
        person.display();                     //line 7
    }
}

class Student1 extends Person1{
    public void display(){                  //line 11
        System.out.println("Display method in Student");
    }
}*/


/*
class Test {
    public static void main(String[] args) {
        double d3 = 1234.0;
        float f2 = 1234;
        float f1 = 1234.0;
    }
}*/

/*
class Employee {
    public void display() {
        System.out.print(" display ");
    }

    public void print(int age) {
        System.out.print(" Employee ");
    }
}

 class Trainee extends Employee {
    public void display(String name) { // line 2
        System.out.print(name);
    }
    public int print(int age) { // line 5
        System.out.print(" Trainee ");
        return age;
    }
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        trainee.display(); // line 10
        trainee.display("Bob"); // line 11
        trainee.print(10); // line 12
    }
}*/

/*
class Employee {
    public static void display() { // line 2
        System.out.print(" Employee ");
    }
}

class Trainee extends Employee {
    public static void display() { // line 5
        System.out.print(" Trainee ");
    }
    public static void main(String[] args) {
        Employee employee = new Trainee();
        employee.display(); // line 9
    }
}*/

/*
abstract class Employee {
    void display() {
        System.out.print(" Employee ");
    }
}

class Trainee extends Employee {
    void display() { // line 5
        System.out.print(" Trainee ");
    }
    public static void main(String[] args) {
        Employee emp = new Trainee();
        emp.display(); // line 10
    }
}*/

/*
class Test {
    public void method() {
        for(int i = 0; i < 3; i++) {
            System.out.print(i);
        }
        System.out.print(i);
    }
}*/


/*
import java.time.LocalDate;

class DateDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2019-03-07");
        LocalDate date1 = LocalDate.of(2019, 12, 07);
        System.out.println(date.getYear()+date1.getYear()
                +" , "+date.compareTo(date1)+" , "+date1.compareTo(date));
    }
}*/

/*
class VarargsTest {
    public static void main(String[] args) {
        displayRegn("Hockey"); // Line 1
        displayRegn("Kho-Kho", 1, 2, 3);
    }

    public static void displayRegn(String nameOfSport, int... iDs) {
        System.out.print(" Registration for " + nameOfSport + ":");
        for (int i = 0; i < iDs.length; i++) {
            System.out.print(iDs[i] + " ");
        }
    }
}*/

/*
class VarargsTest {
    public static void main(String[] args) {
        new VarargsTest().display(5,"Infosys");
        new VarargsTest().display(4,"Infosys","Limited");
    }

    public void display(int b, String... strings) {
        System.out.print(strings[strings.length-1]+" ");
    }
}*/
/*

enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    private int value;
    private Day(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
class TestEnum {
    public static void main(String[] args) {
        for(Day day:Day.values()) {
            // Line 1
            System.out.println(day.getna);
        }
    }
}*/

/*
import java.util.Set;
import java.util.TreeSet;

class SetImpl {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<String>();
        set.add("Infosys");
        set.add("Google");
        set.add("IBM");
        for(String s:set){
            System.out.print(" "+s);
            set.clear();
        }
    }
}*/
/*

import java.util.ArrayList;
import java.util.List;

class ListImpl {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("infosys");
        al.add("google");
        al.add("ibm");
        al.add("Amazon");
        for (int j = 0; j < al.size(); j++) {
            al.remove(j);
            if (al.get(j++).equals("google")) {
                al.add("Oracle");
            }
        }
        System.out.println(al);
    }
}*/

/*
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

class MapDemoCheck {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(2, "A");
        map.put(1, "B");
        map.put(3, "C");
        map.put(null,"E");  //1
        map.put(4,null);    //2
        map.put(1,"D");     //3
        Collection<String> collection = map.values();
        for(String element : collection){
            System.out.println(element);
        }
    }
}*/
/*

import java.util.ArrayList;
import java.util.List;

class MyListGeneric<T extends Number> {
    private List<T> values = new ArrayList<>();

    public void add(T value) {
        values.add(value);
        System.out.println(values);
    }
    public void remove(T value) {
        values.remove(value);
    }
    public T get(int index) {
        return values.get(index);
    }

    public static void main(String[] args) {
        MyListGeneric<Float> myList = new MyListGeneric<Float>();
        myList.add(98.7f);
        myList.add(1009);
    }
}*/

/*
class Test {
    public static void main(String[] args) {
        try {
            System.out.print("In try ");
            return;
        }
        finally {
            System.out.print("In finally ");
        }
        System.out.print("Outside block ");
    }
}*/

/*
import java.util.*;

class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    public boolean equals(Object ob){
        return ((Person)ob).name==this.name;
    }

//    public int hashCode(){
//        return name.length();
//    }
}

class MapImpl {
    public static void main(String[] args) {
        Map<Person,String> map=new HashMap<Person,String>();
        map.put(new Person("jack"),"sendSalesReport");
        map.put(new Person("jack"),"sendAuditReport");
        map.put(new Person("mady"),"sendInventoryReport");

        System.out.println(map.size());
    }
}*/

/*
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class App {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<String>();
        s.add(2);
        s.add("1");
        s.add("3");
        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
    }
}*/
/*

import java.util.*;

class Test {
    public static void main(String[] args) {
        List<Long> l1 = new ArrayList<Long>();
        l1.add(Long.valueOf(10));
        List<Number> l2 = l1;
        System.out.println(l2);
    }
}*/

/*
import java.util.ArrayList;
import java.util.List;

class MyListGeneric<Object> {
    private List<Object> values=new ArrayList<>();

    public void add(Object value) {
        values.add(value);    //line 1
        System.out.println(values);
    }

    public static void main(String[] args) {
        MyListGeneric<String> myListString = new MyListGeneric<String>();
        myListString.add("Good");
    }
}*/
