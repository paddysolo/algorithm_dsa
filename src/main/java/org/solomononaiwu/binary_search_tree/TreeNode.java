package org.solomononaiwu.binary_search_tree;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value){
        if(data==value){
            //prevent duplicate
            return;
        }

        if(value < data){
            if(this.leftChild == null){
                this.leftChild = new TreeNode(value);
            } else {
                this.leftChild.insert(value);
            }
        } else {
            if(this.rightChild == null){
                this.rightChild = new TreeNode(value);
            } else {
                this.rightChild.insert(value);
            }
        }
    }

    public void tranverseInOrder(){
        if(leftChild !=null){
            leftChild.tranverseInOrder();
        }

        System.out.print(data+",");

        if(rightChild != null){
            rightChild.tranverseInOrder();
        }
    }

    public int min(TreeNode tree){
        if(tree.leftChild == null){
            return tree.data;
        }
        return  min(tree.leftChild);
    }

    public int min(){
        if(leftChild == null){
            return data;
        }
        return leftChild.min();
    }

    public int max(TreeNode tree){
        if(tree.rightChild == null){
            return tree.data;
        }
        return max(tree.rightChild);
    }

    public int max(){
        if(rightChild == null){
            return data;
        }
        return rightChild.max();
    }

    public void get(int value){
        if(data == value){
            System.out.printf("Found item : "+data);
            return;
        }
        if(value < data){
            if(leftChild == null){
                System.out.println("Item Not Found");
                return;
            }
            leftChild.get(value);
        } else {
            if(rightChild == null){
                System.out.println("Item Not Found");
                return;
            }
            rightChild.get(value);
        }
    }

    public TreeNode getData(int value){
        if(data == value){
            return this;
        }

        if(value<data){
            if(leftChild!=null){
                return leftChild.getData(value);
            }
        } else {
            if (rightChild!=null){
                return rightChild.getData(value);
            }
        }

        return null;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
