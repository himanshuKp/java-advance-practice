/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/05/21, 12:02 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.hashmap;

public class Node {
    public String key;
    public String value;
    private Node nextNode;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setKeyValue(String key, String value){
        this.key = key;
        this.value = value;
    }
}
