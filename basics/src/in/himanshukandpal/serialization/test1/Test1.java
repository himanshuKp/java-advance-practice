/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/07/21, 5:10 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.serialization.test1;

import java.io.*;

class Demo implements Serializable {
    public int a;
    public String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Demo object = new Demo(1, "Geeks");
        String fileName = "file1.ser";

        try{
//            saving the object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

//            method for serialization object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized.");
        } catch (Exception exception) {
            System.out.println("IO Exception is caught in action.");
        }

        Demo object1 = null;

//      deserialization
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fis);

//          method for deserialization of object
            object1 = (Demo) in.readObject();

            in.close();
            fis.close();

            System.out.println("Object has been deserialized.");

            System.out.println("a = "+object1.a);
            System.out.println("b = "+object1.b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
