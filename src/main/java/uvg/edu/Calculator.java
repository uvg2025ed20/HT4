package uvg.edu;

class Calculator {
    private static Calculator instance;

    private Calculator() {
    }

    public static Calculator getInstance() {
        if (instance == null) instance = new Calculator();
        return instance;
    }

    public String infixToPostfix(String expression) {
        ArrayListStack<Character> stack = new ArrayListStack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) result.append(ch).append(' ');
            else if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') result.append(stack.pop()).append(' ');
                stack.pop();
            } else {
                result.append(stack.pop()).append(' ');
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) result.append(stack.pop()).append(' ');
        return result.toString();
    }

    public int evaluatePostfix(String expression) {
        ArrayListStack<Integer> stack = new ArrayListStack<>();
        for (String token : expression.split(" ")) {
            if (token.matches("\\d+")) stack.push(Integer.parseInt(token));
            else {
                int b = stack.pop(), a = stack.pop();
                switch (token.charAt(0)) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private int precedence(char ch) {
        switch (ch) {
            case '+':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}