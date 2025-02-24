package uvg.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione la estructura a utilizar (vector/nodo/lista): ");
        String structureType = scanner.nextLine();
        String listType = "";
        
        if (structureType.equalsIgnoreCase("lista")) {
            System.out.println("Seleccione la implementación de lista (simplelist/doublelist): ");
            listType = scanner.nextLine();
        }
        
        Calculator calculator = Calculator.getInstance();
        
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Expresión infix: " + line);
                String selectedType = structureType.equalsIgnoreCase("lista") ? listType : structureType;
                Stack<Character> stack = StackFactory.getStack(selectedType);
                String postfix = calculator.infixToPostfix(line, stack);
                System.out.println("Postfix: " + postfix);
                int result = calculator.evaluatePostfix(postfix, StackFactory.getStack(selectedType));
                System.out.println("Resultado: " + result);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
