import java.util.*;

public class BBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of books
        long t = sc.nextLong(); // total time available

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        int left = 0;
        long sum = 0;
        int maxBooks = 0;

        for (int right = 0; right < n; right++) {
            sum += a[right];

            while (sum > t) {
                sum -= a[left];
                left++;
            }

            maxBooks = Math.max(maxBooks, right - left + 1);
        }

        System.out.println(maxBooks);
        sc.close();
    }
}
