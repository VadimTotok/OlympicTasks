import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char[] s = scanner.next().toCharArray();

        int l = 0;
        int r = n - 1;

        while (l <= r) {
            char[] sClone = s.clone();

            for (int i = l; i <= r; i++) {
                if (sClone[i] == '1') {
                    sClone[i] = '0';
                } else {
                    sClone[i] = '1';
                }
            }

            if (isEqual(sClone, sClone[0], n)) {
                System.out.println((l + 1) + " " + (r + 1));
                return;
            }

            l++;
            r--;
        }

        System.out.println("-1");
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
