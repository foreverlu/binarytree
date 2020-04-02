package arrayBinarySearchTree;

public class SearchTree {
    //数组用来保存数据
    private int[] arr;
    private int count;
    private int capacity;

    public SearchTree(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity+1];
        this.count = 0;
    }

    public void createSearchTree(int[] ori){
        System.arraycopy(ori,0,arr,1,ori.length);
        this.count = ori.length;
        //调整树
        for(int i=1;i<=count/2;i++){
            adjustTree(i);
        }
    }




    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
