import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        // or simply:
        // b / n  => numbers divisible by n from 1 to b;
        // (a - 1) / n => numbers divisible by n from 1 to a - 1; because a should be counted
        count = b / n - (a - 1) / n;

        System.out.println(count);
    }
}