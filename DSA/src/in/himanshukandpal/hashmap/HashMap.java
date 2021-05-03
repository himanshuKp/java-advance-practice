/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/05/21, 6:27 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.hashmap;

import java.security.Key;

public class HashMap {
    public LinkedList[] hashMap;

    public HashMap(int size) {
        this.hashMap = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.hashMap[i] = new LinkedList();
        }
    }

    public static void main(String[] args) {
        HashMap birdCensus = new HashMap(15);
        birdCensus.assign("mandarin duck","Central Park Pond");
        birdCensus.assign("monk parakeet","Brooklyn College");
        birdCensus.assign("horned owl","Pelham Bay Park");
        System.out.println(birdCensus.retrieve("mandarin duck"));
        System.out.println(birdCensus.retrieve("monk parakeet"));
        System.out.println(birdCensus.retrieve("horned owl"));
    }

    public int hash(String key){
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode += Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashMap.length;
        return hashCode;
    }

    public void assign(String key, String value){
        int arrayIndex = this.hash(key);
        LinkedList list = this.hashMap[arrayIndex];
        if(list.head == null){
            list.addToHead(key, value);
            return;
        }
        Node current = list.head;
        while (current!=null){
            if (current.key == key){
                current.setKeyValue(key, value);
            }
            if (current.getNextNode()==null){
                current.setNextNode(new Node(key, value));
                break;
            }
            current = current.getNextNode();
        }
    }

    public String retrieve(String key){
        int arrayIndex = this.hash(key);
        Node current = this.hashMap[arrayIndex].head;
        while (current!=null){
            if (current.key == key){
                return current.value;
            }
            current = current.getNextNode();
        }
        return null;
    }
}
