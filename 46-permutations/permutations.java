class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        backtrack(nums,current,result,used);
        return result;
    }
    void backtrack(int arr[],List<Integer> current,List<List<Integer>> result,boolean used[]){
        if(current.size()==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]){
                continue;
            }
            current.add(arr[i]);
            used[i]=true;
            backtrack(arr,current,result,used);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}