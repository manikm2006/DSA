class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double ans=Double.NEGATIVE_INFINITY;
        double sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if(right-left+1>k){
                sum-=nums[left];
                left++;
            }
            if(right-left+1==k){
                double avg=sum/k;
                ans=Math.max(ans,avg);
            }
        }
        return ans;
    }
}