import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        boolean straightMove = x1 == x2 || y1 == y2;
        boolean diagonalMove = Math.abs(x1 - x2) == Math.abs(y1 - y2);
        if (straightMove || diagonalMove) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}