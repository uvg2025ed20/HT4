package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * A calculator class for converting infix expressions to postfix and evaluating them.
 */
class Calculator {
    private static Calculator instance;

    private Calculator() {
    }

    /**
     * Gets the singleton instance of the Calculator.
     *
     * @return the Calculator instance
     */
    public static Calculator getInstance() {
        if (instance == null) instance = new Calculator();
        return instance;
    }

    /**
     * Converts an infix expression to postfix notation.
     *
     * @param expression the infix expression
     * @return the postfix expression
     */
    public String infixToPostfix(String expression) {
        ArrayListStack<Character> stack = new ArrayListStack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : expression.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                continue;  // Ignore spaces
            } else if (Character.isDigit(ch)) {  // If it's a digit, add to the result
                result.append(ch).append(' ');
            } else if (ch == '(') {  // If it's an opening parenthesis, push to the stack
                stack.push(ch);
            } else if (ch == ')') {  // If it's a closing parenthesis, pop until '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop()).append(' ');
                }
                stack.pop();  // Remove the '(' from the stack
            } else {  // It's an operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
        }

        // Pop any remaining operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(' ');
        }

        return result.toString().trim();
    }

    /**
     * Evaluates a postfix expression.
     *
     * @param expression the postfix expression
     * @return the result of the evaluation
     */
    public int evaluatePostfix(String expression) {
        ArrayListStack<Integer> stack = new ArrayListStack<>();

        for (String token : expression.split(" ")) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token.charAt(0)) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    /**
     * Returns the precedence of an operator.
     *
     * @param ch the operator
     * @return the precedence value
     */
    private int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }
}