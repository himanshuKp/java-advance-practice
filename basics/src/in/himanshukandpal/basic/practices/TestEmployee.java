/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/09/21, 2:05 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.practices;

class Employee {

    private String fName;
    private String lName;
    private int jobLevel;
    protected int salary;

    public Employee(String fName, String lName, int jobLevel) {
        this.fName = fName;
        this.lName = lName;
        this.jobLevel = jobLevel;
        setSalary();
    }
    public void setSalary() {
        switch(jobLevel) {
            case 1:{
                salary = 10000;
                break;
            }
            case 2: {
                salary = 50000;
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "Employee [fName=" + fName + ", lName=" + lName + ", jobLevel="
                + jobLevel + ", salary=" + salary + "]";
    }
}

class ContractEmployee extends Employee{
    private int yrsOfExp;

    public ContractEmployee(String fName, String lName, int yrsOfExp) {
        super(fName,lName,0);
        this.yrsOfExp = yrsOfExp;
    }

    public void setSalary() {
        salary= yrsOfExp * 10000;
    }

    @Override
    public String toString() {
        return "ContractEmployee [yrsofExp=" + yrsOfExp +", salary=" +salary + "]";
    }
}

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp = new Employee("John", "Woods", 1);
        ContractEmployee cEmp = new ContractEmployee("George", "Moore", 4);
        System.out.println(emp);
        System.out.println(cEmp);
    }

}