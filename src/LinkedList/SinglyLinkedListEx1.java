package LinkedList;

public class SinglyLinkedListEx1 {
    Node head;

    public static void main(String[] args) {
        SinglyLinkedListEx1 ex1 = new SinglyLinkedListEx1();
        ex1.insert(1);
        ex1.insert(2);
        ex1.insert(3);
        ex1.insert(4);
        ex1.insert(5);
        ex1.printList();
        ex1.printReverse();
        System.out.println("\n Reverse print");
        ex1.printList();

    }


    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
    }

    public void printReverse() {
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node next = current.next;

            current.next = previous;
            previous = current;
            current = next;

        }
        head = previous;

    }


}




