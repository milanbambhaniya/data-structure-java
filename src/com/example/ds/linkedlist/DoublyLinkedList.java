package com.example.ds.linkedlist;

public class DoublyLinkedList {

    private Node head;

    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
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

    private void deleteAt(int position) {
        if (isEmpty()) {
            System.out.println("List is empty. Can not delete element at " + position);
        } else if (position == 1) {
            deleteFront();
        } else {
            int count = 1;
            Node temp = head;
            while (temp != null && count != position) {
                temp = temp.next;
                count++;
            }

            if (temp != null) {
                temp.prev.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                System.out.println("Deleted element at position " + position + " with value " + temp.data);
            } else {
                System.out.println("Not enough elements in the list");
            }
        }
    }
    private void insertAt(int position, int data) {

        if (isEmpty()) {
            if(position != 1) {
                System.out.println("List is empty. Can not insert at position: " + position);
            } else {
                Node node = new Node(data);
                head = node;
            }
        } else if (position == 1) {
            addFront(data);
        } else {
            Node temp = head;
            int count = 1;
            while (null != temp && count != position - 1) {
                temp = temp.next;
                count++;
            }

            if (temp != null) {
                Node node = new Node(data);
                node.next = temp.next;
                node.prev = temp;
                temp.next = node;
            } else {
                System.out.println("Not enough elements to insertAtGiven position " + position);
            }
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
        dll.insertAt(5, 80);
        dll.insertAt(1, 80);
        dll.printList();
        dll.insertAt(1, 20);
        dll.printList();
        dll.insertAt(2, 25);
        dll.printList();
        dll.insertAt(4, 30);
        dll.printList();
        dll.deleteAt(5);
        dll.printList();
        dll.deleteAt(2);
        dll.printList();
        dll.deleteAt(3);
        dll.printList();
        dll.deleteAt(1);
        dll.printList();
        dll.deleteAt(1);
        dll.printList();
    }
}
