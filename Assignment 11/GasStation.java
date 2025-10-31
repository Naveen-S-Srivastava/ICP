import java.util.*;

public class NasAndRice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            long n = sc.nextLong();
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            long D = sc.nextLong();

            long minRice = n * (A - B);
            long maxRice = n * (A + B);
            long minReq = C - D;
            long maxReq = C + D;

            if (maxRice < minReq || minRice > maxReq) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
