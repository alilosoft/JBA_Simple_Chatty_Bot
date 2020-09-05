package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // greeting
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");

        // guessing your age
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        // counting
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "!");
        }

        // Q&A
        System.out.println("Why do you learn programming?");
        System.out.println("1. To solve real life problems.");
        System.out.println("2. To change the world.");
        System.out.println("3. To have fun.");
        System.out.println("4. To make money.");
        int answer = scanner.nextInt();
        while (answer < 1 || answer > 4) {
            System.out.println("Please, try again.");
            answer = scanner.nextInt();
        }
        System.out.println("Congratulations, have a nice day!");
    }
}
