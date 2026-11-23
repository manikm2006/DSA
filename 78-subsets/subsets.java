class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int index=0;
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        sub(nums,index,current,result);
        return result;
    }
    void sub(int arr[],int index,List<Integer> current,List<List<Integer>> result){

        if(index==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        sub(arr,index+1,current,result);
        current.remove(current.size()-1);
        sub(arr,index+1,current,result);

    }
}