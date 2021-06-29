/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/06/21, 5:54 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.challenge.binary;

public class BinaryToGray2 {
    public static void main(String[] args) {
        String binaryNumber = "0011010101";
        toGray(binaryNumber);
    }

    private static void toGray(String binaryNumber) {
        String gray = new String();
        gray += binaryNumber.charAt(0);
        for (int i = 1; i < binaryNumber.length(); i++) {
            gray += xOR(binaryNumber.charAt(i-1), binaryNumber.charAt(i));
        }
        System.out.println("The gray code of: "+binaryNumber+" is: "+gray);
    }

    private static int xOR(char charAt1, char charAt2) {
        if (charAt1 != charAt2) {
            return 1;
        }
        return 0;
    }
}
