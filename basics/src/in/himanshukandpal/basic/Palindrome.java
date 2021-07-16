/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 16/07/21, 4:24 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class Palindrome {

    public static String checkPalindrome(String givenString){
        StringBuffer newString = new StringBuffer();
        char[] s = givenString.toCharArray();
        for(int i=s.length-1;i>=0;i--){
            newString.append(s[i]);
        }
        String finalString = newString.toString();
        if(finalString.equals(givenString)){
            return "true";
        }else {
            return "not palindrome";
        }
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.checkPalindrome("aba"));
    }
}
