import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean end = false;
        int length = 0;
        for (int i = 1; !end; i++) {
            for (int j = 0; j < i && !end; j++) {
                System.out.print(i + " ");
                end = ++length == n; // this is crazy i know but I couldn't resist it!
            }
        }
    }
}