//Brute Force
class Solution {
    public boolean isPerfectSquare(int num) {
        for (long i = 1; i * i <= num; i++) {
            if (i * i == num) return true;
        }
        return false;
    }
}


//Binary Search
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2, right = num / 2; 
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;

            if (sq == num) return true;
            else if (sq < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
