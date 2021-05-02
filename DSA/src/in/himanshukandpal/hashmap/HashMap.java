/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/05/21, 6:27 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.hashmap;

public class HashMap {
    public String[] hashMap;

    public HashMap(int size) {
        this.hashMap = new String[size];
    }

    public static void main(String[] args) {
        HashMap newHashMap = new HashMap(3);
        System.out.println(newHashMap.hash("car"));
        System.out.println(newHashMap.hash("car"));
    }

    public int hash(String key){
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode += Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashMap.length;
        return hashCode;
    }
}
