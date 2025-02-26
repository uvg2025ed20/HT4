package uvg.edu;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.util.Scanner;
        import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List; // Importar java.util.List

        public class App {
            public static void main(String[] args) throws IOException {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Seleccione implementación de stack (arraylist/vector/list):");
                String stackType = scanner.nextLine();
                uvg.edu.List<Integer> list = stackType.equals("list") ? ListFactory.getList("simple") : null;
                Stack<Integer> stack = StackFactory.getStack(stackType, list);

                Calculator calc = Calculator.getInstance();
                InputStream inputStream = App.class.getResourceAsStream("./datos.txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    String postfix = calc.infixToPostfix(line);
                    int result = calc.evaluatePostfix(postfix);
                    System.out.println("Infix: " + line);
                    System.out.println("Postfix: " + postfix);
                    System.out.println("Resultado: " + result);
                }
                reader.close();
            }
        }