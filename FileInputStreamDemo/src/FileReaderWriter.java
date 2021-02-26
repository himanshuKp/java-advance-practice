/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/02/21, 1:46 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("F:\\personal\\Files\\myfile.txt");
            fw = new FileWriter("F:\\personal\\Files\\newFile.txt");

            int data;
            while((data = fr.read())!=-1){
                fw.write(data);
            }

            System.out.println("File copied");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }   finally {
            fr.close();
            fw.close();
        }

    }
}
