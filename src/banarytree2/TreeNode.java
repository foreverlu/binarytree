package banarytree2;
//定义二叉树的节点
public class TreeNode {
    //数据
    private int data;
    //左节点
    private TreeNode leftNode;
    //右节点
    private TreeNode rightNode;




    public void frontDisplay(){
        System.out.print(this.data+", ");
        if(leftNode!=null) leftNode.frontDisplay();
        if(rightNode != null) rightNode.frontDisplay();
    }



    public void sort(){
        int tmp=0;
        if(leftNode!=null){
            leftNode.sort();
            int leftData = leftNode.getData();

            if(leftData<data){
                tmp = data;
                data = leftData;
                leftNode.setData(tmp);
            }
        }
        if(rightNode!=null){
            rightNode.sort();
            int rightData = rightNode.getData();
            if(rightData<data){
                tmp = data;
                data = rightData;
                rightNode.setData(tmp);
            }
        }
    }
    public TreeNode(){}
    public TreeNode(int data){
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
