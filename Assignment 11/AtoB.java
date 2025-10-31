import java.util.*;

public class AtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        List<Long> seq = new ArrayList<>();
        seq.add(b);
        
        while (b > a) {
            if (b % 10 == 1) {
                b = (b - 1) / 10;
                seq.add(b);
            } else if (b % 2 == 0) {
                b = b / 2;
                seq.add(b);
            } else {
                break;
            }
        }
        
        if (b == a) {
            System.out.println("YES");
            Collections.reverse(seq);
            System.out.println(seq.size());
            for (long num : seq) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("NO");
        }
    }
}