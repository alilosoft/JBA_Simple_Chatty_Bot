import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nbr = scanner.next();
        // extract digits
        char d1 = nbr.charAt(0);
        char d2 = nbr.charAt(1);
        char d3 = nbr.charAt(2);
        char d4 = nbr.charAt(3);
        // compare them
        if (d1 == d4 && d2 == d3) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}