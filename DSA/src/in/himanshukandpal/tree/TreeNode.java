/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/05/21, 6:55 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.tree;

import java.util.ArrayList;

public class TreeNode {
    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode child){
        this.children.add(child);
    }

    public void addChild(Object childData){
        TreeNode child = new TreeNode(childData);
        this.children.add(child);
    }
}
