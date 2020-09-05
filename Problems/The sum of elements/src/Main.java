import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int el = scanner.nextInt();
            if (el == 0) {
                break;
            } else {
                sum += el;
            }
        }
        System.out.println(sum);
    }
}