/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 27/09/21, 3:41 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("candidatenames.txt");
        String data = "A long way to submit the data in a shorter way.";
        byte[] inputBytes = data.getBytes();
        outputStream.write(inputBytes);
        outputStream.close();

        FileInputStream inputStream =  new FileInputStream("candidatenames.txt");
        int i = inputStream.read();

        while (i!=-1){
            System.out.print((char) i);
            i = inputStream.read();
        }

        inputStream.close();
    }
}
