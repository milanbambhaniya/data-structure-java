package com.example.ds.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackBuiltIn {

    public void stackUsingStackInterface() {
        Stack<Integer> stack = new Stack<>();
        printStack(stack);
        stack.push(10);
        printStack(stack);
        stack.push(20);
        printStack(stack);
        stack.push(30);
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    public void stackUsingDequeInterface() {
        Deque<Integer> stack = new LinkedList<>();
        printStackDeque(stack);
        stack.push(10);
        printStackDeque(stack);
        stack.push(20);
        printStackDeque(stack);
        stack.push(30);
        printStackDeque(stack);
        stack.push(40);
        printStackDeque(stack);
        System.out.println(stack.peek());
        stack.pop();
        printStackDeque(stack);
        stack.pop();
        printStackDeque(stack);
        stack.pop();
        printStackDeque(stack);
        stack.pop();
        printStackDeque(stack);
        System.out.println(stack.peek());
    }

    private void printStackDeque(Deque<Integer> stack) {
        for (Object obj : stack.toArray()) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    private void printStack(Stack<Integer> stack) {
        Object[] objs = stack.toArray();
        for (Object o : objs) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackBuiltIn stack = new StackBuiltIn();
        stack.stackUsingStackInterface();
        stack.stackUsingDequeInterface();
    }
}
