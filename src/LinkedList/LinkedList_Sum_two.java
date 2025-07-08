package LinkedList;

public class LinkedList_Sum_two {
Node head;
    public static void main(String[] args) {

        LinkedList_Sum_two ex2 = new LinkedList_Sum_two();
        ex2.insertNode(1);
        ex2.insertNode(2);
        ex2.insertNode(3);
        ex2.insertNode(4);
        ex2.insertNode(5);
       System.out.println( ex2.printSum());
    }

    class Node{
        int data;
        Node next;



        public  Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public void insertNode(int data){
        Node newNode = new Node(data);
        Node current = null;
        if(head == null){
            head = new Node(data);
            return;
        }
        current= head;
        while(current.next != null){
            current= current.next;
        }
        current.next=newNode;

    }

    public int printSum(){
        Node current = null;
        int total = 0;
        if(head.next==null){
            total= head.data;
        }
        current= head;
        while(current != null){
            total= total + current.data;
            current= current.next;
        }

        return total;
    }


}
