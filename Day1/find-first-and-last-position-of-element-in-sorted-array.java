class Solution {
    public int[] searchRange(int[] arr, int x) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                ans[0] = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                ans[1] = mid;
                left = mid + 1; 
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
