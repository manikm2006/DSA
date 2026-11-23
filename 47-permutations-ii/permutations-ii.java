class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        backtrack(nums,current,result,used);
        return result;
    }
    void backtrack(int arr[],List<Integer> current,List<List<Integer>> result,boolean used[]){
        if(arr.length==current.size()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && arr[i]==arr[i-1] && !used[i-1]){
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