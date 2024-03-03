import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();

        int[] qArray = new int[m + n];

        for (int i = 0; i < n; i++) {
            qArray[i + m] = q * (i + 1);
        }

        int tm = 0;
        for (int elem : qArray) {
            tm = Math.max(tm, elem) + t;
        }

        System.out.println(tm);
    }
}
