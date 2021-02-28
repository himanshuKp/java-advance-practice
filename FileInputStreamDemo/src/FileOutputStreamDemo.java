/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/02/21, 1:03 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*
* FileInput/OutputStream are good with the binary data
* FileRead/Write are good with the character data
* */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("F:\\personal\\Files\\renal.jpg");
            fos = new FileOutputStream("F:\\personal\\Files\\newRenal.jpg");
            int i;
            while ((i = fis.read())!=-1){
                fos.write(i);
            }
            System.out.println("File copied");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
