import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char[] s = scanner.next().toCharArray();

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                char[] s1 = s.clone();
                for (int i = l; i <= r; i++) {
                    if (s1[i] == '1') {
                        s1[i] = '0';
                    } else {
                        s1[i] = '1';
                    }
                }

                if (isEqual(s1, s1[0], n)) {
                    System.out.println((l + 1) + " " + (r + 1));
                    System.exit(0);
                }
            }
        }

        System.out.println(-1);
    }

    private static boolean isEqual(char[] arr, char value, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != value) {
                return false;
            }
        }
        return true;
    }
}
