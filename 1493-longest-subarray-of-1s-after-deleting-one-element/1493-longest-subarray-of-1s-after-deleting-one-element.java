class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length,l=0,r=0,z=0,max=0,k=1;
        while(r<n){
            if(nums[r]==0)z++;
            while(z>k){
                if(nums[l]==0)z--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max-1;
    }
}