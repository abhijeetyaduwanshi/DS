package linkedlist;

public class PrintingFirstLinkedList {
    Node head;
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        PrintingFirstLinkedList myList = new PrintingFirstLinkedList();

        myList.head = new Node(20);
        Node two = new Node(22);
        Node three = new Node(25);

        myList.head.next = two;
        two.next = three;
        myList.printList();
    }

    // printing the linked list
    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    } // output: 20 22 25
}
