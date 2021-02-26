/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/02/21, 3:13 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("F:\\personal\\Files\\emp.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee emp = (Employee) ois.readObject();
            System.out.println("ID: "+emp.id);
            System.out.println("Name: "+emp.name);
            System.out.println("Salary: "+emp.salary);
            System.out.println("Adhaar: "+emp.adhaar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
