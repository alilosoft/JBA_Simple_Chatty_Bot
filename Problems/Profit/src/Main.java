import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double funds = scanner.nextInt();
        int interest = scanner.nextInt();
        int goal = scanner.nextInt();

        int years = 0;
        while (funds < goal) {
            funds += funds * interest / 100;
            years++;
        }
        System.out.println(years);
    }
}