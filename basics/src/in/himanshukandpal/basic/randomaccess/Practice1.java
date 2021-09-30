/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 28/09/21, 10:02 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("candidatenames.txt", "r");
        file.writeUTF("Writing");
        System.out.println("Current position: "+file.getFilePointer());
        file.seek(0);
        System.out.println(file.readUTF());
        System.out.println("Current position: "+file.getFilePointer());
        file.close();
    }
}
