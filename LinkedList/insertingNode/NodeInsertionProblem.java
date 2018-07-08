package insertingNode;

public class NodeInsertionProblem {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // inserting a new node in the front of the linked list
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    //inserting a new node in after a given node of the linked list
    public void insertAfter(Node previousNode, int newData) {
        if(previousNode == null) {
            System.out.println("The given previous node can not be null");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    // inserting a new node at the end of the linked list
    public void append(int newData) {
        Node newNode = new Node(newData);

        if(head == null) {
            head = new Node(newData);
            return;
        }

        newNode.next = null;

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        return;
    }

    // printing the linked list
    public void printList() {
        Node myNode = head;
        while(myNode != null){
            System.out.println(myNode.data);
            myNode = myNode.next;
        }
    }

    // main method
    public static void main(String[] args) {
        NodeInsertionProblem list = new NodeInsertionProblem();

        list.append(6);
        list.push(7);
        list.push(1);
        list.insertAfter(list.head.next.next, 15);
        list.append(4);
        list.insertAfter(list.head, 8);
        list.printList();
    }
}
