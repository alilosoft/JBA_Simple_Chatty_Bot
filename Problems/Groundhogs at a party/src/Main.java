import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean successfulWeekend = weekend && nbr >= 15 && nbr <= 25;
        boolean successfulWeekdays = !weekend && nbr >= 10 && nbr <= 20;
        System.out.println(successfulWeekdays || successfulWeekend);
    }
}
