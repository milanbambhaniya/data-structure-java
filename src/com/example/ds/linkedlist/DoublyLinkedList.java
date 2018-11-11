package com.example.ds.linkedlist;

public class DoublyLinkedList {

    private Node head;

    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private boolean isEmpty() {
        return null == head;
    }

    private void addFront(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    private void deleteFront() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (null == head.next) {
            System.out.println("Deleted element: " + head.data);
            head = null;
        } else {
            System.out.println("Deleted element: " + head.data);
            head.next.prev = null;
            head = head.next;
        }
    }

    private void delete() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (null == head.next) {
            System.out.println("Deleted element: " + head.data);
            head = null;
        } else {
            Node temp = head;
            while (null != temp.next) {
                temp = temp.next;
            }
            System.out.println("Deleted element: " + temp.data);
            temp.prev.next = null;
        }
    }

    private void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            Node temp = head;
            while (null != temp.next) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }

    private void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (null != temp) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.printList();
        dll.deleteFront();
        dll.addFront(10);
        dll.printList();
        dll.deleteFront();
        dll.printList();
        dll.add(50);
        dll.printList();
        dll.addFront(20);
        dll.printList();
        dll.add(60);
        dll.printList();
        dll.deleteFront();
        dll.printList();
        dll.delete();
        dll.printList();
        dll.delete();
        dll.printList();
    }
}
