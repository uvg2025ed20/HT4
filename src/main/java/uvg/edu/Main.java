package uvg.edu;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.util.Scanner;
        import java.io.IOException;
        import java.util.List; // Importar java.util.List

        public class Main {
            public static void main(String[] args) throws IOException {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Seleccione implementación de stack (arraylist/vector/list):");
                String stackType = scanner.nextLine();
                List<Integer> list = stackType.equals("list") ? ListFactory.getList("simple") : null;
                Stack<Integer> stack = StackFactory.getStack(stackType, list);

                Calculator calc = Calculator.getInstance();
                BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
                String expression = reader.readLine();
                reader.close();

                String postfix = calc.infixToPostfix(expression);
                int result = calc.evaluatePostfix(postfix);

                System.out.println("Postfix: " + postfix);
                System.out.println("Resultado: " + result);
            }
        }