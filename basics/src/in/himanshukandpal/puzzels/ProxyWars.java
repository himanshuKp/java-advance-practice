/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/06/21, 4:34 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.puzzels;

import java.io.*;

public class ProxyWars implements Serializable {
    Object writeReplace(){
        return new Proxy();
    }

    static class Proxy implements Serializable {    //byte byte, circular reference
        Object readResolve(){
            return new ProxyWars();
        }
    }

    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ProxyWars original = new ProxyWars();
        new ObjectOutputStream(b).writeObject(original);
        ProxyWars copyProxy = (ProxyWars) new ObjectInputStream(
                new ByteArrayInputStream(b.toByteArray())).readObject();
        System.out.println(copyProxy.equals(original));
    }
}
