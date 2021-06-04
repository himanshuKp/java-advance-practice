/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 02/06/21, 3:43 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.tree.bst;

public class BinarySearchTree {
    public int value;
    public int depth;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public BinarySearchTree(int value) {
        this.value = value;
        this.depth = 1;
        this.left = null;
        this.right = null;
    }

    public BinarySearchTree(int value, int depth) {
        this.value = value;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }

    public void insert(int value){
        if (value < this.value){
            if (this.left == null){
                this.left = new BinarySearchTree(value, this.depth + 1);
                System.out.printf("Tree Node %d added to the left of %d at depth %d.\n", value, this.value, this.depth + 1);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null){
                this.right = new BinarySearchTree(value, this.depth+1);
                System.out.printf("Tree Node %d added to the right of %d at depth %d.\n", value, this.value, this.depth + 1);
            } else {
                this.right.insert(value);
            }
        }
    }

    public BinarySearchTree getNodeByValue(int value){
        if(value == this.value){
            return this;
        } else if(value < this.value && this.left != null){
            return this.left.getNodeByValue(value);
        } else if(value > this.value && this.right != null){
            return this.right.getNodeByValue(value);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree(100);

        root.insert(50);
        root.insert(125);
        root.insert(75);
        root.insert(25);

        // Get nodes by value below
        System.out.println(root.getNodeByValue(75));
        System.out.println(root.getNodeByValue(55));
    }
}
