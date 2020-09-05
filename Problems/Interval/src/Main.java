import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // (−15,12]
        boolean inInterval1 = n > -15 && n <= 12;
        // (14,17)
        boolean inInterval2 = n > 14 && n < 17;
        // [19,+∞)
        boolean inInterval3 = n >= 19;
        // (−15,12]∪(14,17)∪[19,+∞)
        if (inInterval1 || inInterval2 || inInterval3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}