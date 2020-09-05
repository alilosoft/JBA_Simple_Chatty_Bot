import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for (int i = 0; i < nbr; i++) {
            int grade = scanner.nextInt();
            if (grade == 5) {
                aCount++;
            } else if (grade == 4) {
                bCount++;
            } else if (grade == 3) {
                cCount++;
            } else if (grade == 2) {
                dCount++;
            }
        }

        System.out.println(dCount + " " + cCount + " " + bCount + " " + aCount);
    }
}