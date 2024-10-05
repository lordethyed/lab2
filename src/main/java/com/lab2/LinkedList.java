package com.lab2;

public class LinkedList {
    Node head;

     // list.printList();

        // list.deleteFromBeginning();

        // list.printList();

        // list.deleteFromEnd();

        // list.printList();

        // list.reverseLinkedList();

        // list.printList();


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20); 
        list.insertAtBeginning(10); 

        list.insertAtEnd(5);
        list.insertAtEnd(40);

        list.printList();

        list.deleteFromBeginning();

        list.printList();

        list.deleteFromEnd();

        list.printList();

        list.reverseLinkedList();

        list.printList();
    }

    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);

        newNode.next = head;

        head = newNode;
    }

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

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

    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        } 
    }

    public void deleteFromEnd() {
        if (head == null) {
            return;
        }
        else if (head.next == null) {
            head = null;
        }
        else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void reverseLinkedList() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
