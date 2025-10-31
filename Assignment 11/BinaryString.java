import java.util.*;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder output = new StringBuilder();
        
        while (q-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong(); 
            String s = sc.next();
            
            char[] result = s.toCharArray();
            int pos = 0; 
            
            for (int i = 0; i < n; i++) {
                if (result[i] == '0') {

                    long move = Math.min(k, i - pos);
                    k -= move;
                    result[i] = '1';
                    result[(int)(i - move)] = '0';
                    
                    pos++; 
                }
            }
            output.append(new String(result)).append("\n");
        }
        
        System.out.print(output);
    }
}
