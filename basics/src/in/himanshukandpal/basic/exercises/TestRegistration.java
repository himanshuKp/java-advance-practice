/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 6:50 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.exercises;

public class TestRegistration {
    public static void main(String[] args) {
        Registration registration1 = new Registration("Kevin", "MN9891N", new long[]{9452555543L, 2111133456L});

        for (long telephoneNo : registration1.getTelephoneNo()) {
            System.out.println(telephoneNo);
        }
    }


}
