/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/10/21, 8:12 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

interface DemoInterface1 {
    void noArguments();
}

interface DemoInterface2 {
    void twoArguments(String s1, Integer i1);
}

interface DemoInterface3 {
    Integer oneArguments(Integer i2);
}

class Employee {
    Integer empId;
    String empName;
    String country;

    public Employee(Integer empId, String empName, String country) {
        this.empId = empId;
        this.empName = empName;
        this.country = country;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

public class Lambda1 {
    public static void main(String[] args) {
        System.out.println("Example 1: No arguments lambda expression");
        DemoInterface1 demoInterface1 = () -> System.out.println("No Arguments");
        demoInterface1.noArguments();

        System.out.println("Example 2: Two argument lambdas");
        DemoInterface2 demoInterface2 = (String name, Integer phone) -> {
            System.out.println("Name: "+name+", Phone: "+phone);
        };
        demoInterface2.twoArguments("Pratibha", 9958);

        System.out.println("Example 3: One argument");
        DemoInterface3 demoInterface3 = sum -> sum*sum;
        System.out.println(demoInterface3.oneArguments(22));

        List<Employee> allEmployee = new ArrayList<>();
        allEmployee.add(new Employee(111, "pratibha", "America"));
        allEmployee.add(new Employee(222, "himanshu", "india"));
        allEmployee.add(new Employee(444, "meenu", "china"));
        System.out.println(allEmployee);
        allEmployee.sort((employee1, employee2)->employee1.getCountry().compareTo(employee2.getCountry()));
        System.out.println(allEmployee);
    }
}
