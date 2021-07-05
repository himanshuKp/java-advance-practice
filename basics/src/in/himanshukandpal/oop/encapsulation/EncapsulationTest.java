/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 05/07/21, 11:42 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.oop.encapsulation;

class Student {
    private String geekName;
    private int geekRollNo;
    private int geekAge;

    public String getGeekName() {
        return geekName;
    }

    public void setGeekName(String geekName) {
        this.geekName = geekName;
    }

    public int getGeekRollNo() {
        return geekRollNo;
    }

    public void setGeekRollNo(int geekRollNo) {
        this.geekRollNo = geekRollNo;
    }

    public int getGeekAge() {
        return geekAge;
    }

    public void setGeekAge(int geekAge) {
        this.geekAge = geekAge;
    }
}

public class EncapsulationTest {
    public static void main(String[] args) {
        Student obj = new Student();

//        setters
        obj.setGeekName("Himanshu");
        obj.setGeekAge(28);
        obj.setGeekRollNo(324);

        System.out.println(obj.getGeekName());
        System.out.println(obj.getGeekAge());
        System.out.println(obj.getGeekRollNo());
    }
}
