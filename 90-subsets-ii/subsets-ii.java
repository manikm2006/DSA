class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int start=0;
        Arrays.sort(nums);
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        sub(nums,start,current,result);
        return result;
    }
    void sub(int arr[],int start,List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]){
                continue;
            }
            current.add(arr[i]);
            sub(arr,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}