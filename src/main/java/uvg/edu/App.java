package uvg.edu;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Main application class for testing Stack implementations and Calculator.
 */
public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select stack implementation (arraylist/vector/list):");
        String stackType = scanner.nextLine();
        IList<Integer> list = stackType.equals("list") ? ListFactoryImp.getList("simple") : null;
        IStack<Integer> stack = StackFact.getStack(stackType, list);

        Calculator calc = Calculator.getInstance();
        InputStream inputStream = App.class.getResourceAsStream("./datos.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            String postfix = calc.infixToPostfix(line);
            int result = calc.evaluatePostfix(postfix);
            System.out.println("Infix: " + line);
            System.out.println("Postfix: " + postfix);
            System.out.println("Result: " + result);
        }
        reader.close();
    }
}