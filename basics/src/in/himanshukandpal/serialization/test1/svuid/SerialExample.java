/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/07/21, 5:23 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.serialization.test1.svuid;

import java.io.*;

public class SerialExample {
    public static void main(String[] args) {
        Emp object = new Emp(2, 1000, "Geek", 28);
        String fileName = "himanshu.txt";

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream output = new ObjectOutputStream(file);

//            method for serialization of object
            output.writeObject(object);

            output.close();
            file.close();

            System.out.println("Data before deserialization:");
            printObject(object);

//            value of static variable changed
//            object.b = 2000;
            object.name="HK";   //will not be changed during deserialization
            object.age = 30; //will not be changed during deserialization
            object.a = 3;   //will be 0 during desrialization
            Emp.b = 4;  //changed during deserialization
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

//            method for deserialzation of object
            Emp object1 = (Emp) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized.");
            printObject(object1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printObject(Emp object) {
        System.out.println("Name: "+object.name);
        System.out.println("Age: "+object.age);
        System.out.println("a: "+object.a);
        System.out.println("b: "+ Emp.b);
    }
}
