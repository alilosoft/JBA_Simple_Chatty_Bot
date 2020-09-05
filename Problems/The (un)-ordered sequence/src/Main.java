import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ordered = true;
        int order = 0; // 0: UNKNOWN , 1: ASCENDING -1: DESCENDING
        int current = scanner.nextInt();
        int next;
        while ((next = scanner.nextInt()) != 0) {
            if (current == next) {
                continue;
            }
            if (order == 0) {
                if (current < next) {
                    order = 1; // ASC
                } else {
                    order = -1; // DSC
                }
            } else {
                ordered = (current - next) * order < 0;
                if (!ordered) {
                    break;
                }
            }
            current = next;
        }
        System.out.println(ordered);
    }
}