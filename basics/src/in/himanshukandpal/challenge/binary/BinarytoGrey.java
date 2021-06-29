/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/06/21, 5:24 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.challenge.binary;

/*
* A Binary code can be converted into its equivalent Gray code as:
  - The MSB(Most Significant Bit) of the Binary code will be the MSB of the equivalent Gray code.
  - All the remaining bits are obtained by performing the XOR operation on the bit at that position with the bit at the previous position in the binary string.
* */

public class BinarytoGrey {
    public static void main(String[] args) {
        String binary = "0011010101";
        toGray(binary);
    }

// convert the given binary string into its equivalent gray code
    private static void toGray(String binary) {
        String grey = new String();

        grey += binary.charAt(0);

        for (int i = 1; i < binary.length(); i++) {
            grey += (Integer.parseInt(String.valueOf(binary.charAt(i-1)))) ^ (Integer.parseInt(String.valueOf(binary.charAt(i))));
        }

        System.out.println("The grey code of: "+binary+" is "+grey);
    }
}
