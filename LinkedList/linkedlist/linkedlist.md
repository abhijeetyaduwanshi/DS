Linked List
===

Introduction
---

- Linked List is a linear data structure
- Unlike arrays, linked list elements are not stored at contiguous location; but the elements are linked using pointers

Why Linked List over arrays?
---

- Arrays can be used to store linear data of similar types, but arrays have limitations
- The size of the arrays is fixed, so we must know the upper limit on the number of elements in advance
- Also, generally, the allocated memory is equal to the upper limit irrespective of the usage
- Inserting a new element in an array of elements is expensive, because room has to be created for the new elements and to create room existing elements have to shifted
- Deletion is also expensive with arrays until and unless some special techniques are used

Linked lists advantages over arrays
---

- Dynamic size
- Ease of insertion/deletion

Linked list drawbacks
---

- Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists
- Extra memory space for a pointer is required with each element of the list
- Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists

Linked list representation
---

- A linked list is represented by a pointer to the first node of the linked list
- The first node is called head
- If the linked list is empty, then value of head is NULL
- Each node in a list consists of at least two parts
- a. data
- b. pointer (Or reference to the next node)
- In Java, LinkedList can be represented as a class and a Node as a separate class. The LinkedList class contains a reference of Node class type

```
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
```

Simple linked list in java
---

Linked list with 3 nodes.

```
// a simple Java program to introduce a linked list
public class FirstLinkedList {
    // head of list
    Node head;

    /* Linked list Node.  This inner class is made static so that
           main() can access it */
    public static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) {
        /* Start with the empty list. */
        FirstLinkedList llist = new FirstLinkedList();

        llist.head  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);

        /* Three nodes have been allocated  dynamically.
              We have refernces to these three blocks as first,
              second and third

              llist.head        second              third
                 |                |                  |
                 |                |                  |
             +----+------+     +----+------+     +----+------+
             | 1  | null |     | 2  | null |     |  3 | null |
             +----+------+     +----+------+     +----+------+ */

        // Link first node with the second node
        llist.head.next = second;

        /*  Now next of first Node refers to second.  So they
                both are linked.

             llist.head        second              third
                |                |                  |
                |                |                  |
            +----+------+     +----+------+     +----+------+
            | 1  |  o-------->| 2  | null |     |  3 | null |
            +----+------+     +----+------+     +----+------+ */

        // Link second node with the third node
        second.next = third;

        /*  Now next of second Node refers to third.  So all three
                nodes are linked.

             llist.head        second              third
                |                |                  |
                |                |                  |
            +----+------+     +----+------+     +----+------+
            | 1  |  o-------->| 2  |  o-------->|  3 | null |
            +----+------+     +----+------+     +----+------+ */
    }
}
```

Printing a linked list
---

```
/* This function prints contents of linked list starting from head */
public void printList() {
    Node n = head;
    while(n != null) {
        System.out.print(n.data + " ");
        n = n.next;
    }
}
```

The above method can be called at the end of the main method. The required linked list will be printed.

Output:
---

```
1 2 3
```

Inserting a node
---
There are three ways of inserting a node in a linked list
1. At the front of the linked list
2. After a given node
3. At the end of the linked list

Inserting a node at the front of the linked list
---
New node added before the head of the given linked list becomes the new head of the linked list

For example:
Given linked list 10->15->20->25
Add an item 5 at the front
Required linked list becomes 5->10->15->20->25

Let us call the function that adds node at the front of the list is push()

The push() must receive a pointer to the head pointer, because push must change the head pointer to point to the new node

It is a 4 step process
1 & 2: Allocate the Node & Put in the data
3. Make next of new Node as head
4. Move the head to point to new Node

```
public void push(int new_data) {
    /* 1 & 2: Allocate the Node &
           Put in the data*/
    Node new_node = new Node(new_data);

    /* 3. Make next of new Node as head */
    new_node.next = head;

    /* 4. Move the head to point to new Node */
    head = new_node;
}
```

Inserting a node after a given node of the linked list
---
For example:
Given linked list 10->15->20->25
Add an item 18 after 2 places
Required linked list becomes 10->15->18->20->25

Let us call the function that adds node after a given node of the list is insertAfter()

We are given pointer to a node, and the new node is inserted after the given node

It is a 5 step process
1. Check if the given Node is null
2 & 3: Allocate the Node & Put in the data
4. Make next of new Node as next of prev_node
5. Make next of prev_node as new_node

```
public void insertAfter(Node prev_node, int new_data) {
    /* 1. Check if the given Node is null */
    if (prev_node == null) {
        System.out.println("The given previous node cannot be null");
        return;
    }

    /* 2. Allocate the Node & 3. Put in the data*/
    Node new_node = new Node(new_data);

    /* 4. Make next of new Node as next of prev_node */
    new_node.next = prev_node.next;

    /* 5. make next of prev_node as new_node */
    prev_node.next = new_node;
}
```
















Inserting a node at the end of the linked list
---
For example:
Given linked list 10->15->20->25
Add an item 30 at the end of the linked list
Required linked list becomes 10->15->20->25->30

Let us call the function that adds node at the end of the list is append()

It is a 7 step process
1, 2 & 3. Allocate the Node & Put in the data & Set next as null
4. If the Linked List is empty, then make the new node as head
5. This new node is going to be the last node, so make next of it as null
6. Else traverse till the last node
7. Change the next of last node

```
public void append(int new_data) {
    /* 1. Allocate the Node &
    2. Put in the data
    3. Set next as null */
    Node new_node = new Node(new_data);

    /* 4. If the Linked List is empty, then make the
        new node as head */
    if (head == null) {
        head = new Node(new_data);
        return;
    }

    /* 4. This new node is going to be the last node, so
      make next of it as null */
    new_node.next = null;

    /* 5. Else traverse till the last node */
    Node last = head;
    while (last.next != null)
        last = last.next;

    /* 6. Change the next of last node */
    last.next = new_node;
    return;
}
```