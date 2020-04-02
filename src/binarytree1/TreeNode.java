package binarytree1;

public class TreeNode {
    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return this.value;
    }

    public TreeNode(int value){
        this.value=value;
    }
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void frontShow() {
        System.out.print(value+", ");
        if(leftNode != null) leftNode.frontShow();
        if(rightNode != null) rightNode.frontShow();
    }

    public void midShow() {
        if(leftNode!=null) leftNode.midShow();
        System.out.print(value+", ");
        if(rightNode != null) rightNode.midShow();
    }

    public void backShow() {
        if(leftNode != null) leftNode.backShow();
        if(rightNode !=null) rightNode.backShow();
        System.out.println(value);
    }

    public void sort() {


        int left =0,right=0;

        if(leftNode != null){
            leftNode.sort();
            left = leftNode.getValue();
        }
        if(rightNode != null){
            rightNode.sort();
            right = rightNode.getValue();
        }

        if(leftNode != null&&left < value) {
            leftNode.setValue(value);
            value = left;

        }
        if(rightNode != null&&right < value){
            rightNode.setValue(value);
            value = right;

        }

    }







}
