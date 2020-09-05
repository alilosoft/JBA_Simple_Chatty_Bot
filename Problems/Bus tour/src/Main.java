import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean crashed = false;

        for (int i = 1; i <= bridges && !crashed; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                crashed = true;
            }
        }
        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}