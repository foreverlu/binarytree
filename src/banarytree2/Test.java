package banarytree2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = {8,4,5,7,6};
        Random random = new Random();
//        for(int i=0;i<arr.length;i++){
//            arr[i]=random.nextInt(30);
//        }
        System.out.println(Arrays.toString(arr));
        Tree tree = createTree(arr);
        tree.sort();
        tree.frontDisplay();

    }



    private static Tree createTree(int[] ori){
        List<TreeNode> treeNodes = new ArrayList<>();
        //先定义根节点
        Tree tree = new Tree();
        //将ori数组的第一个值赋给root节点
        TreeNode root = new TreeNode(ori[0]);
        tree.setRoot(root);
        treeNodes.add(root);
//        //添加root节点的左右节点
//        if(ori.length>1) {
//            TreeNode rootLeftNode = new TreeNode(ori[1]);
//            root.setLeftNode(rootLeftNode);
//            treeNodes.add(rootLeftNode);
//        }
//        if(ori.length>2){
//            TreeNode rootRightNode = new TreeNode(ori[2]);
//            root.setRightNode(rootRightNode);
//            treeNodes.add(rootRightNode);
//        }


        if(ori.length>1){

            for(int i=0;i<ori.length/2 -1;i++){
                TreeNode leftNode = new TreeNode(ori[2*i+1]);
                treeNodes.get(i).setLeftNode(leftNode);
                treeNodes.add(leftNode);
                TreeNode rightNode = new TreeNode(ori[2*i+2]);
                treeNodes.get(i).setRightNode(rightNode);
                treeNodes.add(rightNode);
            }
            int k = ori.length/2-1;
            TreeNode leftNode = new TreeNode(ori[2*k+1]);
            treeNodes.get(k).setLeftNode(leftNode);
            treeNodes.add(leftNode);
            if(ori.length%2==1){
                TreeNode rightNode = new TreeNode(ori[2*k+2]);
                treeNodes.get(k).setRightNode(rightNode);
                treeNodes.add(rightNode);
            }

        }
        return tree;

    }

}
