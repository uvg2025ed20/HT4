package uvg.edu;

import java.util.Stack;

public class Calculator {
    private static Calculator instance;
    
    private Calculator() {}
    
    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }
    
    public String infixToPostfix(String infix) {
        Stack<Character> stack = StackFactory.getStack("list");
        StringBuilder postfix = new StringBuilder();
        
        for (char c : infix.toCharArray()) {
            if (Character.isDigit(c)) {
                postfix.append(c).append(' ');
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }
        return postfix.toString().trim();
    }
    
    private int precedence(char op) {
    switch (op) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        default:
            return -1;
    }
}

public int evaluatePostfix(String postfix) {
    Stack<Integer> stack = StackFactory.getStack("list");
    for (String token : postfix.split(" ")) {
        if (token.matches("\\d+")) {
            stack.push(Integer.parseInt(token));
        } else {
            int b = stack.pop();
            int a = stack.pop();
            switch (token) {
                case "+":
                    stack.push(a + b);
                    break;
                case "-":
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(a * b);
                    break;
                case "/":
                    stack.push(a / b);
                    break;
            }
        }
    }
    return stack.pop();
}

}