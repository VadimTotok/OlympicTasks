import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];
        String input = sc.next();
        for (int i = 0; i < n; i++) s[i] = input.charAt(i) - '0';

        int l = 0;
        int r = n;

        while (l <= r) {
            int[] sClone = s.clone();
            int[] array = new int[r - l];

            for (int i = 0; i < array.length; i++) {
                array[i] = sClone[l + i];
                array[i] = (array[i] == 1) ? 0 : 1;
            }

            System.arraycopy(array, 0, sClone, l, array.length);
            int sum = Arrays.stream(Arrays.copyOfRange(sClone, 0, n)).sum();

            if (sum == 0 || sum == n) {
                System.out.printf("%d %d%n", (l + 1), r);
                return;
            }

            l++;
            r--;
        }

        System.out.println("-1");
    }
}
