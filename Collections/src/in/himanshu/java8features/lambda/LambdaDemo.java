package in.himanshu.java8features.lambda;

import in.himanshu.java8features.lambda.functional_interface.InterfaceA;
import in.himanshu.java8features.lambda.functional_interface.SumInterface;

public class LambdaDemo {
    public static void main(String[] args) {
//        InterfaceA object1 = new InterfaceAImpl();
//        lambda implementation
//        InterfaceA object1 = ()-> System.out.println("Called lambda method");
//        object1.method1();

//        calculate sum using lambda
        SumInterface sumInterface = (a,b)-> System.out.println("Sum is: "+(a+b));
        sumInterface.getSum(10,20);
    }
}
