package com.homework;

public class ExpressionBalancing {

    public static boolean isBalanced(String exp) {
        SingleArrayStack stack = new SingleArrayStack(exp.length());

        for (int i = 0; i < exp.length(); i++) {
            char current = exp.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if (current == ')' && opening != '(') {
                    return false;
                }

                if (current == '}' && opening != '{') {
                    return false;
                }

                if (current == ']' && opening != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] expressions = {
                "{[()]}",
                "()[]{}",
                "(a + b) * [c - d]",
                "{[(])}",
                "((())",
                "())",
                ""
        };

        for (String exp : expressions) {
            System.out.println("\"" + exp + "\" -> " + isBalanced(exp));
        }
    }
}