import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long operand1 = scanner.nextLong();
        String operation = scanner.next();
        long operand2 = scanner.nextLong();

        switch (operation) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(operand1 / operand2);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}