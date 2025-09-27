//Binary Search
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        int ans = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int num : nums) {
                if (num >= mid) count++;
            }
            if (count >= k) {
                ans = mid;     
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return ans;
    }
}
//Min Heap
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); 
        }
        return pq.peek();
    }
}
