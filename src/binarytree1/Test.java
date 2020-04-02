package binarytree1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test {
    public static void main(String[] args) {

        int[] arr ={4,5,3,7,9};
//        BinaryTree binaryTree = createBinTree(arr);
        System.out.println(Arrays.toString(arr));
//        TreeNode root = new TreeNode(1);
//        TreeNode rootL = new TreeNode(2);
//        rootL.setLeftNode(new TreeNode(4));
//        rootL.setRightNode(new TreeNode(8));
//        root.setLeftNode(rootL);
//        TreeNode rootR = new TreeNode(7);
//        rootR.setLeftNode(new TreeNode(21));
//        rootR.setRightNode(new TreeNode(9));
//        root.setRightNode(rootR);
//        binaryTree.setRoot(root);

//        binaryTree.frontShow();
        //System.out.println("==================");
        //binaryTree.midShow();
        //System.out.println("==================");
        //binaryTree.backShow();

        /*******************************************************************/
        BinaryTree binaryTree = createSearchTree(arr);
        //binaryTree.sort();
        binaryTree.midShow();
        //System.out.println("==================");
        //System.out.println(binaryTree.getRoot().getValue());
        //TreeNode i = binaryTree.binarySearch(6);
        TreeNode j = binaryTree.binarySearch(4);
        System.out.println(j.getValue());
        binaryTree.delete(7);
        binaryTree.midShow();
        TreeNode max = binaryTree.getMax();
        System.out.println(max.getValue());
    }

    //二叉查找樹的創建
    private static BinaryTree createSearchTree(int[] ori){
        BinaryTree tree = new BinaryTree();
        for(int i=0;i<ori.length;i++){
            tree.insertNode(ori[i]);
        }
        return tree;
    }







    public static BinaryTree createBinTree(int[] arr){
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(arr[0]);
        List<TreeNode> nodes = new ArrayList<>();



        nodes.add(root);
        for(int i=1;i<arr.length;i++){
            TreeNode treeNode = new TreeNode(arr[i]);
            nodes.add(treeNode);
        }

        root.setLeftNode(nodes.get(1));
        root.setRightNode(nodes.get(2));

        for(int i=1;i<arr.length/2-1;i++){
            nodes.get(i).setLeftNode(nodes.get(2*i+1));
            nodes.get(i).setRightNode(nodes.get(2*i+2));
        }
        int t = arr.length/2-1;
        nodes.get(t).setLeftNode(nodes.get(2*t+1));
        if(arr.length%2 == 1)
            nodes.get(t).setRightNode(nodes.get(2*t+2));
        binaryTree.setRoot(root);
        return binaryTree;


    }

}
