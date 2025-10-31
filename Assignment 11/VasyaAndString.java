import java.util.*;

public class VasyaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int maxLen = Math.max(maxSubstring(s, k, 'a'), maxSubstring(s, k, 'b'));
        System.out.println(maxLen);

        sc.close();
    }

    static int maxSubstring(String s, int k, char ch) {
        int left = 0, changes = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != ch) changes++;

            while (changes > k) {
                if (s.charAt(left) != ch) changes--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
