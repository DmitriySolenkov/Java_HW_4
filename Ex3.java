import java.util.Scanner;
import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение в обратной польской записи через пробел (пример: 2 3 + 5 *):");
        String[] str = scan.nextLine().split(" ");
        scan.close();
        Stack<Double> stack = new Stack();
        for (int index = 0; index < str.length; index++) {
            if (isNum(str[index])) {
                stack.push(Double.parseDouble(str[index]));
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                switch (str[index]) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num2 - num1);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num2 / num1);
                        break;

                }
            }

        }
        System.out.println(stack.pop());
    }

    public static boolean isNum(String str) {
        boolean bool = false;
        try {
            Double.parseDouble(str);
            bool = true;
        } finally {
            return bool;
        }
    }
}
