class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        int start=0;

        backtrack(candidates,start,target,current,result);
        return result;
    }
    void backtrack(int[]arr,int start,int remaining,List<Integer> current,List<List<Integer>> result){
        if(remaining==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(arr[i]>remaining){
                continue;
            }
            current.add(arr[i]);
            backtrack(arr,i,remaining-arr[i],current,result);
            current.remove(current.size()-1);
        }
    }
}