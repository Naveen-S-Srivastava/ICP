import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Sliding_Window_Maximum {
    //Brute Force Approach
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new LinkedList<>();
        int n = nums.length;
        for(int i = 0;i<=n-k;i++){
            int maxi = nums[i];
            for(int j = i;j<i+k;j++ ){
                maxi = Math.max(maxi,nums[j]);

            }
            list.add(maxi);
        }
        int[] arr = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    //Optimized Approach
    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int idx = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                res[idx++] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
}
    

