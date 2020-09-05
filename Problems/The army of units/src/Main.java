import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();
        if (nbr < 1) {
            System.out.println("no army");
        } else if (nbr < 20) {
            System.out.println("pack");
        } else if (nbr < 250) {
            System.out.println("throng");
        } else if (nbr < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}