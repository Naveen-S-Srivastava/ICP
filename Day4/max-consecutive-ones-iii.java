class Solution {
    public int longestOnes(int[] nums, int k) {
       int max=0,l=0,countZeros=0;
       for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZeros++;
            }
            while(countZeros>k){
                if(nums[l]==0){
                    countZeros--;
                }
                l++;
            }
            max=Math.max(max,i-l+1);
        } 
       return max;
    }
}