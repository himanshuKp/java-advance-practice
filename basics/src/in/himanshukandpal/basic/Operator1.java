/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 1:03 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class Operator1 {
    String bankName, area, phoneNo;
    Operator1() {
    }

    public static void main(String[] args){
//        int sum=0;
//        for(int i=0,j=0;i<5&j<5;++i,j=i+1)
//            sum+=i;
//        System.out.println(sum);
      /*  int sum[] = {0,41,5,6,7};
        int sum1[] = new int[5];
        int []sum2 = new int[4];
        int[] sum3 = new int[4];
        int[] sum4 = null;

        int myArr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 6;
        n = myArr[n];
        n = myArr[n / 2];
        System.out.println(myArr[n] / 2);*/



        double balance = 6000;
        double rateOfInterest = 0.10;
        double interest = 0;
        double withdrawal = 500;
        double deposit = 600;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for(int i: arr) {   // The iteration in the loop happens automatically. The value is assigned to
            //variable i from the array in every iteration of the loop.
            balance += deposit;   // Loop will repeat the statements in its body till the last element is reached in the array.
            balance -= withdrawal;
            interest = balance * rateOfInterest;
            balance += interest;
            System.out.println("The interest for the month " + i + " is " + interest);
        }

        Operator1 bank = new Operator1();
        System.out.println(bank.bankName);
}

}
