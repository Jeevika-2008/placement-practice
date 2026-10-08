class Solution {
    public double findMaxAverage(int[] nums, int k) {
        Scanner sc=new Scanner(System.in);       
        int sum=0;
        for(int i=0; i<k; sum+=nums[i++]);
        double max=sum;
        for(int i=k; i<nums.length; i++){
            sum+=nums[i]-nums[i-k];
             max = Math.max(max,sum);
        }
        return(max/k);

        
    }
}