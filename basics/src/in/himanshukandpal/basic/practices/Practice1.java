/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/09/21, 1:45 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.practices;

import java.util.Arrays;
import java.util.List;

public class Practice1 {
    static boolean status;
    public static void main(String[] args) {
        /*String[] companies = new String[]{"Infy","Wipro","Accenture","IBM"};
        List<String> companiesList = Arrays.asList(companies);

        for (String company: companiesList){
            System.out.println(company);
        }*/

        /*if (status == false){
            System.out.println("false");
        } else {
            System.out.println("true");
        }*/

        String message1 = "Hello my dear developers.";
        long previous1 = System.currentTimeMillis();

        String modifiedMessage = "";
        for (int i=0;i<10000;i++){
            modifiedMessage = modifiedMessage + message1;
        }

        System.out.println("Snippet 1: "+(System.currentTimeMillis() - previous1));

        String message2 = "Hello my dear developers";
        long previous2 = System.currentTimeMillis();

        StringBuilder modifiedMessage2 = new StringBuilder();
        for (int i=0;i<10000;i++){
            modifiedMessage2.append(message2);
        }
        System.out.println("Snippet 2: "+(System.currentTimeMillis() - previous2));
    }
}
