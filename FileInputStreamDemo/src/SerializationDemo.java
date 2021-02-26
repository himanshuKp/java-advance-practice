/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/02/21, 3:01 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("F:\\personal\\Files\\emp.ser");
            oos = new ObjectOutputStream(fos);

            Employee emp = new Employee(1, "Himanshu", 12222, 22222);
            oos.writeObject(emp);
            System.out.println("Employee object serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
