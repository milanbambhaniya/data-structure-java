package com.example.ds.linkedlist;

public class ReverseSinglyLinkedList {

    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    private boolean isEmpty() {
        return null == head;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public void reverseList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (null != current) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }


    public static void main(String[] args) {
        ReverseSinglyLinkedList reverseSinglyLinkedList = new ReverseSinglyLinkedList();
        reverseSinglyLinkedList.add(10);
        reverseSinglyLinkedList.add(20);
        reverseSinglyLinkedList.add(50);
        reverseSinglyLinkedList.add(100);
        reverseSinglyLinkedList.printList();
        reverseSinglyLinkedList.reverseList();
        reverseSinglyLinkedList.printList();
    }

}
