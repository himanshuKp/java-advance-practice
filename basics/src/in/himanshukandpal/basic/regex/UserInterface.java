/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/09/21, 11:29 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInterface {

    public boolean mobileNumberMatcher(String mobileNumber){
        Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher mobileMatcher = regex.matcher(mobileNumber);
        return mobileMatcher.matches();
    }

    public static void main(String[] args) {
        UserInterface object = new UserInterface();
        System.out.println("Number is valid: "+object.mobileNumberMatcher("111-222-3334"));
    }
}
