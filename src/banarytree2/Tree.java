package banarytree2;
//定义树
public class Tree {
    //root节点
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontDisplay(){
        //先序遍历 父节点->左节点->右节点
        root.frontDisplay();

    }

    public void sort(){
        root.sort();
    }

}
