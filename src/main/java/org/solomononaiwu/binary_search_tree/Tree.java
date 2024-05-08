package org.solomononaiwu.binary_search_tree;

public class Tree {
    TreeNode root;

    public void insert(int value){
        if(root == null){
            this.root = new TreeNode(value);
        } else {
            this.root.insert(value);
        }
    }


    public void transverseInOrder(){
        if(root!=null){
            root.tranverseInOrder();
        }
    }

    public int min(){
        if(root!=null){
            return root.min(root);
        } else {
            return 0;
        }
    }


    public int max(){
        if (root!=null){
            return root.max(root);
        } else return 0;
    }

    public void get(int value){
        if(root!=null){
            root.get(value);
        } else {
            return;
        }
    }

    public TreeNode getData(int value){
        if(root!=null){
            return root.getData(value);
        }

        return null;
    }


    public int minimum(){
        if(root!=null){
            return root.min();
        } else {
            return 0;
        }
    }

    public int maximum(){
        if(root!=null){
            return root.max();
        } else return 0;
    }







}
