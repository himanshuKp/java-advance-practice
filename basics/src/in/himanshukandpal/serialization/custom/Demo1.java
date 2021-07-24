/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/07/21, 7:04 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.serialization.custom;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        TestCase testCase = new TestCase("GFG_ADMIN", "pass");
        System.out.println("Before serialization.");
        System.out.println("Username: "+testCase.username+", password: "+testCase.password);
        try{
            FileOutputStream fos = new FileOutputStream("test.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(testCase);

            System.out.println("\nAfter serialization.");
            System.out.println("Username: "+testCase.username+", password: "+testCase.password);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("test.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            TestCase testCase1 = (TestCase) ois.readObject();

            System.out.println("\nAfter Deserialization.");
            System.out.println("Username: "+testCase1.username+", password: "+testCase1.password);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
