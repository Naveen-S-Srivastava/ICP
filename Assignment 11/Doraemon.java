import java.util.*;

public class Doraemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int target = 0, current = 0, q = 0;

        for (char c : s1.toCharArray()) {
            if (c == '+') target++;
            else target--;
        }

        for (char c : s2.toCharArray()) {
            if (c == '+') current++;
            else if (c == '-') current--;
            else q++;
        }

        int diff = target - current;

        double result = 0.0;

        if (Math.abs(diff) <= q && (q + diff) % 2 == 0) {
            int k = (q + diff) / 2;
            result = combination(q, k) / Math.pow(2, q);
        }

        System.out.printf("%.12f\n", result);
    }

    static double combination(int n, int k) {
        if (k < 0 || k > n) return 0;
        double res = 1.0;
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}
