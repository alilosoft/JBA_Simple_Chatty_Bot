import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();
        int nReady = 0;
        int nFixed = 0;
        int nRejected = 0;

        for (int i = 0; i < nbr; i++) {
            int result = scanner.nextInt();
            if (result == 0) {
                nReady++;
            } else if (result == 1) {
                nFixed++;
            } else {
                nRejected++;
            }
        }

        System.out.println(nReady + " " + nFixed + " " + nRejected);
    }
}