package com.homework;

import java.util.Stack;

public class ReverseStack {

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int element = stack.pop();

        reverse(stack);

        insertAtBottom(stack, element);
    }

    private static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        int top = stack.pop();

        insertAtBottom(stack, element);

        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println("Before: " + stack1);
        reverse(stack1);
        System.out.println("After: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(5);

        System.out.println("Before: " + stack2);
        reverse(stack2);
        System.out.println("After: " + stack2);

        Stack<Integer> stack3 = new Stack<>();

        System.out.println("Before: " + stack3);
        reverse(stack3);
        System.out.println("After: " + stack3);
    }
}