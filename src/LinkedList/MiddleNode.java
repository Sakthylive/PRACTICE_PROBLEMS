package LinkedList;

public class MiddleNode {// this is also called as Floyd's Algorithm to find if the linked List is cycle
Node head;

    public static void main(String[] args) {

        MiddleNode ex1 = new MiddleNode();
        ex1.insert(1);
        ex1.insert(2);
        ex1.insert(3);
        ex1.insert(4);
        ex1.insert(5);
       Node node = ex1.findMiddle();
       System.out.println(node.data);
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
   public void insert(int data){
        Node newNode = new Node(data);
        Node currentNode;
        if(head == null){
            head = newNode;
            return;
        }
    currentNode=head;
       while (currentNode.next != null) {
           currentNode=currentNode.next;
       }
       currentNode.next=newNode;

   }


   public Node findMiddle(){
        Node slow=head;
        Node fast=head;
       while( fast != null && fast.next != null ){
           fast = fast.next.next;
           slow = slow.next;
       }
       return slow;

   }

}
