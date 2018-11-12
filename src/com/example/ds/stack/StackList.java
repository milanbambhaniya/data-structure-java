package com.example.ds.stack;

public class StackList {

    LinkList li = new LinkList();

    public void push(int data) {
        li.addFront(data);
    }

    public int pop() {
        return li.deleteFront();
    }

    public void printStack() {
        li.printList();
    }

    private class Node {
        int data;
        Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private class LinkList {
        Node first;

        private void addFront(int data) {
            Node node = new Node(data);
            node.next = first;
            first = node;
        }

        private int deleteFront() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            } else {
                Node temp = first;
                first = first.next;
                System.out.println("Deleted element " + temp.data);
                return temp.data;
            }
        }

        private void printList() {
            if (isEmpty()) {
                System.out.println("Empty List");
            } else {
                Node temp = first;
                while (null != temp) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println("");
            }
        }

        private boolean isEmpty() {
            return null == first;
        }

    }

    public static void main(String[] args) {
        StackList stackList = new StackList();
        stackList.printStack();
        stackList.push(10);
        stackList.printStack();
        stackList.push(20);
        stackList.printStack();
        stackList.push(30);
        stackList.printStack();
        stackList.push(40);
        stackList.printStack();
        stackList.pop();
        stackList.printStack();
        stackList.push(80);
        stackList.printStack();
        stackList.pop();
        stackList.printStack();
        stackList.pop();
        stackList.printStack();
        stackList.pop();
        stackList.printStack();
        stackList.pop();
        stackList.printStack();
    }
}
