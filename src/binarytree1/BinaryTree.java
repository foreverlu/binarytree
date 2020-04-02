package binarytree1;


public class BinaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontShow() {
        root.frontShow();
    }

    public void midShow() {
        root.midShow();
    }

    public void backShow() {
        root.backShow();
    }

    public void sort() {
        root.sort();
    }

    public TreeNode getRoot(){
        return root;
    }


    public void insertNode(int i){
        if(root == null ){
           root = new TreeNode(i);
            return;
        }
        TreeNode p = null;
        TreeNode node = root;
        while(node != null){
            if(node.getValue() < i){
                p = node;
                node = node.getRightNode();
            }else {
                p = node;
                node = node.getLeftNode();
            }
        }
        TreeNode newNode = new TreeNode(i);
        if(p.getValue()>i) p.setLeftNode(newNode);
        else p.setRightNode(newNode);
    }

    public TreeNode binarySearch(int i){
        TreeNode node = root;
        while (node!=null){
            if(node.getValue() == i) return node;
            else if(node.getValue()>i) node = node.getLeftNode();
            else node = node.getRightNode();
        }

        return null;
    }

    public int delete(int i){
        if (root == null) return 0;
        TreeNode node = root;
        TreeNode p = null;

        while (node!=null && node.getValue()!=i){
            p = node;
            if(node.getValue()>i) node = node.getRightNode();
            else node = node.getRightNode();
        }

        if(node == null) return 0;


        //先考慮要刪除的節點有兩個子節點的情況,找到右節點最小節點
        if (node.getLeftNode()!=null && node.getRightNode()!=null){
            TreeNode minP = node.getRightNode();
            TreeNode minPP = node;
            while (minP.getLeftNode()!=null){
                minPP = minP;
                minP = minP.getLeftNode();
            }

            node.setValue(minP.getValue());
            node = minP;    //將右子樹中最小值替換掉node的值後,變成刪除minP節點,並且minP沒有左節點
            p = minPP;
        }

        TreeNode child = null;

        //刪除節點是葉子結點,或者僅有一個子節點
        if(node.getLeftNode()!=null) child = node.getLeftNode();
        else if(node.getRightNode() != null) child = node.getRightNode();

        if(p==null) root = child;
        else if(p.getLeftNode()==node) p.setLeftNode(child);
        else p.setRightNode(child);
        return 1;
    }

    public TreeNode getMax(){
        TreeNode node = root;
        if(node ==null) return null;
        while (node.getRightNode()!=null){
            node = node.getRightNode();
        }
        return node;
    }





}
