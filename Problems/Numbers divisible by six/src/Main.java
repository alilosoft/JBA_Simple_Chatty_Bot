import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < nbr; i++) {
            int el = scanner.nextInt();
            if (el % 6 == 0) {
                sum += el;
            }
        }
        System.out.println(sum);
    }
}