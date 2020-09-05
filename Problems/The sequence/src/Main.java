import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt(); // skip the elements count
        int max = 0;
        while (scanner.hasNext()) {
            int el = scanner.nextInt();
            if (el % 4 == 0 && el > max) {
                max = el;
            }
        }
        System.out.println(max);
    }
}
