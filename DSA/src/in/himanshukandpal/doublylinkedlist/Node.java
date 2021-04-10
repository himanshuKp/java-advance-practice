/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 09/04/21, 5:50 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.doublylinkedlist;

public class Node {
    public String data;
    private Node nextNode;
    private Node previousNode;

    public Node(String data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }
}
