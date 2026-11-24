class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> current=new ArrayList<>();
        backtrack(0,s,current,result);
        return result;
    }
    void backtrack(int start,String s,List<String> current,List<List<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(current));
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                current.add(s.substring(start,end+1));
                backtrack(end+1,s,current,result);
                current.remove(current.size()-1);
            }
        }
        
    }
    boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}