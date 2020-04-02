package heap;

import banarytree2.Tree;

/**
 * 用二叉树实现堆不太方便,插入的时候需要遍历确定插入的位置
 * 堆还是使用数组来创建
 */
public class Heap {
    private TreeNode root;
    private int count;


    public Heap(){
        root = new TreeNode();
        count++;
        root.setPos(count);

    }

    public Heap(int data){
        root = new TreeNode(data);
        count++;
        root.setPos(count);
    }

    //创建大顶堆
    public Heap createBigTopHeap(int[] arr){
        int index = 0;
        if(root.getData()==0){
            root.setData(arr[index++]);
        }

        for(int i=index;i<arr.length;i++){
            TreeNode node = new TreeNode(arr[i]);

        }
        return null;
    }

    public void insertNode(int v){
        TreeNode newNode = new TreeNode(v);
        TreeNode node = root;
        TreeNode parent = null;

    }




    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



}
