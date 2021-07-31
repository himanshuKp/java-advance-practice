/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/07/21, 7:05 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.serialization.custom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestCase implements Serializable {
    String username;
    transient String password;

    public TestCase(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
//        to perform default serialization
        oos.defaultWriteObject();

//        encrypted password
        String e_password = "123" + password;

//        writing encrypted password to file
        oos.writeObject(e_password);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
//        perform default deserialization
        ois.defaultReadObject();

//        deserializing encrypted text from the file
        String e_password = (String) ois.readObject();

//        decrypting the password
        password = e_password.substring(3);
    }
}
