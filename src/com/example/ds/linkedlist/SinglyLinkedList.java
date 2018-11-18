package com.example.ds.linkedlist;

public class SinglyLinkedList {
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

    public void addAtStart(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            head = head.next;
            System.out.println("Deleted Item is: " + temp.data);
        }
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (null == head.next) {
            System.out.println("Deleted Item is: " + head.data);
            head = null;
        } else {
            Node temp = head;
            Node prev = temp;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            System.out.println("Deleted Item is: " + temp.data);
        }
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

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.printList();
        linkedList.deleteFront();
        linkedList.delete();
        linkedList.add(37);
        linkedList.addAtStart(5);
        linkedList.printList();
        linkedList.add(10);
        linkedList.printList();
        linkedList.delete();
        linkedList.printList();
        linkedList.addAtStart(40);
        linkedList.printList();
        linkedList.deleteFront();
        linkedList.printList();
        linkedList.deleteFront();
        linkedList.printList();
        linkedList.delete();
        linkedList.printList();
    }

}
