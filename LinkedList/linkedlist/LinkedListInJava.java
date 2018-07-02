package linkedlist;

public class LinkedListInJava {
    // head of list
    Node head;

    // Linked list Node
    public class Node {

        int data;
        Node next;

        /* Constructor to create a new node
         Next is by default initialized
         as null */
        Node(int d) {
            data = d;
        }
    }
}
