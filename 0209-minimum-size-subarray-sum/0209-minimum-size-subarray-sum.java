class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length, sum=0, min =Integer.MAX_VALUE,l=0,r=0;
        while (r<n){
            sum+=nums[r];
            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return (min==Integer.MAX_VALUE)?0:min;

    }
}