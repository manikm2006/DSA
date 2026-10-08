class NumArray {
    int array[];
    public NumArray(int[] nums) {
        this.array=Arrays.copyOf(nums,nums.length);
        // for(int i=0;i<nums.length;i++){
        //     this.array[i]=nums[i];
        // }
    }
    
    public int sumRange(int left, int right) {
        int n=array.length;
        int sum=0;
        if(left<=n && n>=right){
            for(int i=0;i<n;i++){
                if(i>=left && i<=right){
                    sum+=array[i];
                }
            }
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */