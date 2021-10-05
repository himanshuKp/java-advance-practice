/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/10/21, 4:21 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.testing;

/*class SwapEmployee {
    public <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        for (T t : a) {
            System.out.print(t+ "\t");
        }

    }
}

class Tester {
    public static void main(String args[]) {
        SwapEmployee obj = new SwapEmployee();
        Integer[] empIdList = { 101, 102, 100, 104 };
        obj.swap(empIdList, 1, 2);
    }

}*/

/*
import java.util.Arrays;
import java.util.List;

class Tester {
    public static double sumList(List<? extends Number> list) {
        float sum = 1.0f;
        for (Number n : list)
            sum = sum + n.floatValue();
        return sum;
    }

    public static void main(String args[]) {
        List<Float> ref = Arrays.asList(16.0f, 1.0f, 3.0f);
        System.out.println(sumList(ref));
    }
}*/

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
    String productId;
    double price;

    Product() {
    }

    Product(String n, double a) {
        productId = n;
        price = a;
    }

    public int compareTo(Product product) {
        if (this.price == product.price)
            return 0;
        else if (this.price > product.price)
            return 1;
        else
            return -1;
    }

}

class Demo4 {
    public static void main(String args[]) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product("Shawl", 300.00));
        list.add(new Product("Linen", 255.00));
        list.add(new Product("Roger", 100.00));
        list.add(new Product("Tommy", 450.00));
        list.add(new Product("Tammy", 175.00));
        Collections.sort(list);

        for (Product product : list)
            System.out.print(product.productId + ":" + product.price + ", ");
    }
}*/
/*

import java.io.*;

class Employee {
    String name;
}

class ContractEmployee extends Employee {
    int salary;

    public static void main(String[] args) throws IOException, ClassNotFoundException, IOException {
        ContractEmployee cemp = new ContractEmployee(10000, "Sam");
        FileOutputStream fos = new FileOutputStream("serial.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cemp);

        FileInputStream fis = new FileInputStream("serial.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        cemp = (ContractEmployee) ois.readObject();
        System.out.println(cemp);
    }

    ContractEmployee(int salary, String name) {
        super.name = name;
        this.salary = salary;
    }

    public String toString() {
        return super.name + salary;
    }
}*/
/*


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class IOQ {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        String data = "Learning ";
        fos.write(data.getBytes());
        fos.close();
        fos = new FileOutputStream("output.txt");
        data = "Java is really fun!";
        fos.write(data.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream("output.txt");
        int i = fis.read();
        System.out.println((char)i);
    }
}*/
/*

class ThreadClass extends Thread
{
    public ThreadClass()
    {
        System.out.println(Thread.currentThread().getPriority());
    }
}
class Priority
{
    public static void main(String[] args) {
        new ThreadClass();
    }
}*/
/*

class SynchronizedExample extends Thread
{
    synchronized public void run()
    {
        System.out.println("start");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){}
        System.out.println("End");
    }
}
class Synchronization
{
    public static void main(String[] args)
    {
        new SynchronizedExample().start();
        new SynchronizedExample().start();
    }
}*/
/*

class ThreadImpl {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.setName("welcomeThread");    // Line 1
        thread.start();
        System.out.println("Welcome to ");
        thread.wait(2000);                  // Line 2
        System.out.println("Infosys");
    }
}
*/
/*

class Running implements Runnable {
    public void run() {
        // code of run method
    }
}

class App {
    public static void main(String[] args) {
        Running r = new Running ();
        Thread t = new Thread(r);
        t.start();
        System.out.print(t.getState() + " ");
        try{
            t.sleep(100);
            System.out.print(t.getState());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
*/

/*
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyThread implements Runnable {

    MyThread() {
        System.out.print("New Thread is created.");    // Line 1
    }

    @Override
    public void run() {
        try {
            System.out.print("Am from MyThread...");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class FixedThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            MyThread t1 = new MyThread();
            executor.execute(t1);
        }
        System.out.print("\nMaximum number of threads inside pool: " + executor.getMaximumPoolSize() + "\n");    // Line 2
        executor.shutdown();
    }
}*/

/*
class Tester {
    public static void main(String[] args) {
        String[] values = { "9a4b x", "3a z", "a", "1a2b3c " };
        int counter = 0;
        for (String value : values) {
            if (value.matches("(\\d[a-z])+\\s\\w?")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}*/
/*
class Tester {
    public static void main(String[] args) {
        String[] values = { "xy", "xay", "xaby", "xa" };
        for (String value : values) {
            if (value.matches("x.y")) {
                System.out.println(value);
            }
        }
    }
}*/

/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularEx {
    public static void main(String... arg) {
        Pattern pattern = Pattern.compile("M+", 5);
        Matcher matcher = pattern.matcher("M Merit Match MM m mM");
        while (matcher.find())
            System.out.print(matcher.group() + " ");
    }
}
*/

import java.util.ArrayList;
import java.util.List;

class MyListGeneric {
    public static void displayElements(List<? super Integer> li) {
        System.out.println(li);     //line 4
    }
    public static void main(String[] args) {
        List<Number> i1=new ArrayList<Number>();
        i1.add(1009.9f);            //line 1
        i1.add(200);                //line 2
        i1.add(new Double(300));    //line 3
        displayElements(i1);
    }
}