package Tree;

public class BinaryTreeUsingArray {
    int[] tree;
    int size ;
    public static void main(String[] args) {
        int[] tree;
        BinaryTreeUsingArray binaryTreeUsingArray = new BinaryTreeUsingArray(15);
        binaryTreeUsingArray.displayrecords();
        binaryTreeUsingArray.insertrecords(1);
        binaryTreeUsingArray.insertrecords(2);
        binaryTreeUsingArray.insertrecords(3);
        binaryTreeUsingArray.insertrecords(4);
        binaryTreeUsingArray.insertrecords(5);
        binaryTreeUsingArray.insertrecords(6);
        binaryTreeUsingArray.insertrecords(7);
        binaryTreeUsingArray.insertrecords(8);
        binaryTreeUsingArray.insertrecords(9);

        binaryTreeUsingArray.displayrecords();

        System.out.println("\n Pre-order Traversal:");
        binaryTreeUsingArray.preOrderTraversal(7);

    }
    BinaryTreeUsingArray(int capacity){
        tree= new int[capacity];
        size=0;
    }

    public void insertrecords(int value){
       if(size>tree.length){
           System.out.println("Tree is full, cannot insert more records");
           return;
       }else{
           tree[size] = value;
           size++;
       }
    }

    public void displayrecords(){
        if(size ==0){
            System.out.println("Tree is empty");
            return;
        }else{
            System.out.println("Tree records are: ");
            for(int i=0; i<size; i++){
                System.out.print(tree[i] + " ");
            }
        }
    }

    public void preOrderTraversal(int index){
        if(index >= size){
            return;
        }
        System.out.println(tree[index] + " ");
        preOrderTraversal(getLeftchildIndex(index));
        preOrderTraversal(getRightChildIndex(index));
    }


    private int getLeftchildIndex(int index){
        return 2*index +1;
    }
    private int getRightChildIndex(int index){
        return 2*index +2;
    }
    private int getParentIndex(int index){
        return (index-1)/2;
    }




}
