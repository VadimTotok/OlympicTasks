package year2023.src;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        int daysToInfect = 0;
        int infectedComputers = 0;

        while (infectedComputers < k) {
            daysToInfect++;
            infectedComputers += t;
        }

        int totalDays = daysToInfect + m;
        System.out.println(totalDays);
    }
}
