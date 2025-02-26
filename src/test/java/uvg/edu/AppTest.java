package uvg.edu;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Unit test class for Stack implementations and Calculator.
 */
public class AppTest {

    private ListStack<Integer> listStack;
    private StackVec<Integer> vectorStack;
    private ArrayListStack<Integer> arrayListStack;
    private Calculator calculator;

    @Before
    public void setUp() {
        listStack = new ListStack<>(new LinkListSimp<>());
        vectorStack = new StackVec<>();
        arrayListStack = new ArrayListStack<>();
        calculator = Calculator.getInstance();
    }

    // Tests for ListStack
    @Test
    public void testListStackPushPop() {
        listStack.push(10);
        listStack.push(20);
        assertEquals((Integer) 20, listStack.pop());
        assertEquals((Integer) 10, listStack.pop());
    }

    @Test
    public void testListStackPeek() {
        listStack.push(5);
        assertEquals((Integer) 5, listStack.peek());
    }

    @Test
    public void testListStackIsEmpty() {
        assertTrue(listStack.isEmpty());
        listStack.push(1);
        assertFalse(listStack.isEmpty());
    }

    // Tests for VectorStack
    @Test
    public void testVectorStackPushPop() {
        vectorStack.push(30);
        vectorStack.push(40);
        assertEquals((Integer) 40, vectorStack.pop());
        assertEquals((Integer) 30, vectorStack.pop());
    }

    @Test
    public void testVectorStackPeek() {
        vectorStack.push(15);
        assertEquals((Integer) 15, vectorStack.peek());
    }

    @Test
    public void testVectorStackIsEmpty() {
        assertTrue(vectorStack.isEmpty());
        vectorStack.push(2);
        assertFalse(vectorStack.isEmpty());
    }

    // Tests for ArrayListStack
    @Test
    public void testArrayListStackPushPop() {
        arrayListStack.push(50);
        arrayListStack.push(60);
        assertEquals((Integer) 60, arrayListStack.pop());
        assertEquals((Integer) 50, arrayListStack.pop());
    }

    @Test
    public void testArrayListStackPeek() {
        arrayListStack.push(25);
        assertEquals((Integer) 25, arrayListStack.peek());
    }

    @Test
    public void testArrayListStackIsEmpty() {
        assertTrue(arrayListStack.isEmpty());
        arrayListStack.push(3);
        assertFalse(arrayListStack.isEmpty());
    }

    // Tests for Calculator
    @Test
    public void testInfixToPostfix() {
        String infix = "3 + 4 * 2";
        String expectedPostfix = "3 4 2 * +";
        assertEquals(expectedPostfix, calculator.infixToPostfix(infix));
    }

    @Test
    public void testEvaluatePostfix() {
        String postfix = "3 4 2 * +";
        int expected = 11;
        assertEquals(expected, calculator.evaluatePostfix(postfix));
    }

    @Test
    public void testComplexExpression() {
        String infix = "(1 + 2) * (3 + 4)";
        String postfix = calculator.infixToPostfix(infix);
        int result = calculator.evaluatePostfix(postfix);
        assertEquals(21, result);
    }
}