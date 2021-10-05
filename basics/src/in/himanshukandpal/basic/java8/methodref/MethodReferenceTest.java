/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 04/10/21, 1:07 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.java8.methodref;

import in.himanshukandpal.serialization.test1.svuid.Emp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    private Integer empId;
    private String empName;
    private String county;
    private Double salary;

    public Employee(Integer empId, String empName, String county, Double salary) {
        this.empId = empId;
        this.empName = empName;
        this.county = county;
        this.salary = salary;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", county='" + county + '\'' +
                ", salary=" + salary +
                '}';
    }

    /* public static int compareByCountry(Employee emp1, Employee emp2) {
        return emp1.getCounty().compareTo(emp2.getCounty());
    }*/
}

class FullTimeEmployees extends Employee {
    public double generateSalarySlip(){
        System.out.println("Salary slip of full time employees");
        return super.getSalary()*1.20;  //20% increment
    }

    public FullTimeEmployees(Integer empId, String empName, String county, Double salary) {
        super(empId, empName, county, salary);
    }
}

class PartTimeEmployees extends Employee {
    public double generateSalarySlip(){
        System.out.println("Salary slip of part time employees");
        return super.getSalary()*1.10;
    }

    public PartTimeEmployees(Integer empId, String empName, String county, Double salary) {
        super(empId, empName, county, salary);
    }
}

public class MethodReferenceTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Pratibha", "New Zealand", 1111.1);
        Employee e2 = new Employee(102, "Himanshu", "India", 1211.1);
        Employee e3 = new Employee(103, "Joshi", "America", 2231.1);

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(new FullTimeEmployees(104, "Ramesh", "India", 33333.3));
        empList.add(new FullTimeEmployees(105, "Geeta", "China", 2222.2));
        empList.add(new PartTimeEmployees(106, "Ravi", "America", 4444.4));
        empList.add(new PartTimeEmployees(107, "Meenu", "India", 3333.3));

        List<Employee> newEmpList = new ArrayList<>();

        empList.forEach(employee -> {
            if (employee.getEmpId()<105){
                newEmpList.add(employee);
            }
        });

        newEmpList.forEach(employee -> System.out.println(employee.getEmpId()+" : "+employee.getEmpName()));

        newEmpList.sort((employee1, employee2) -> employee1.getEmpId() - employee2.getEmpId());

        newEmpList.forEach(employee -> System.out.println(employee.getEmpId()+" : "+employee.getEmpName()));
        /*System.out.println("Presenting even employee id names:");
        evaluate(empList, n -> n%2 == 0);
        System.out.println("Presenting odd employee id names: ");
        evaluate(empList, n -> n%2 != 0);*/

       /* for (Employee employee: empList){
            double salary = computeSalary(employee, emp -> emp.getSalary() * 1.11);
            System.out.println("Employee: "+ employee.getEmpName()+" OLD SALARY: "+employee.getSalary()+", new salary: "+salary);
        }*/
/*

        System.out.println("HR Report");
        generateReport(empList, emp -> System.out.println(emp.getEmpId() + ", name: "+emp.getEmpName()));

        System.out.println("Manager report");
        generateReport(empList, emp -> System.out.println(emp.getEmpId() + ", name: "+emp.getEmpName() + ", country: "+emp.getCounty()));
*/
//        System.out.println(empList);

//        empList.forEach(employee -> System.out.println(employee.getEmpName()));
    }

    public static void generateReport(List<Employee> employees, Consumer<Employee> consumer){
        for (Employee e: employees){
            consumer.accept(e);
        }
    }

    public static void evaluate(List<Integer> employeeId, Predicate<Integer> predicate){
        for (int empId: employeeId){
            if (predicate.test(empId)){
                System.out.println(empId);
            }
        }
    }

    public static double computeSalary(Employee e, Function<Employee, Double> fn){
        return fn.apply(e);
    }
}
