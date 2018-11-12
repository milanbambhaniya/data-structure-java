package com.example.ds.stack;

public class Stack {

    private int tos = -1;
    private int a[];

    public Stack(int size) {
        a = new int[size];
    }

    public void pop() {
        if (tos == -1) {
            System.out.println("Stack is empty");

        } else {
            System.out.println("Element deleted from stack is " + a[tos--]);
        }
    }

    public void push(int data) {
        if (tos == a.length - 1) {
            System.out.println("Stack is full");
        } else {
            a[++tos] = data;
        }
    }

    public void print() {
        if (tos == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= tos; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.print();
        stack.pop();
        stack.push(10);
        stack.print();
        stack.pop();
        stack.print();
        for (int i = 0; i < 11; i++) {
            stack.push(i);
        }
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
    }

}
