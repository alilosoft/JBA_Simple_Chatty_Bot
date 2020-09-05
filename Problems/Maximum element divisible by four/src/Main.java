import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int el = scanner.nextInt();
            if (el % 4 == 0 && el > max) {
                max = el;
                // this was my first solution, but its less readable than the current one!
                // max = el > max ? el : max;
            }
        }
        System.out.println(max);
    }
}