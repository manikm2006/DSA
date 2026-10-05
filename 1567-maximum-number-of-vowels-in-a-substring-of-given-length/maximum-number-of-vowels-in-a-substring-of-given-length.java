class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int ans=0;
        int sum=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
                sum++;
            }
            if(right-left+1>k){
                char lch=s.charAt(left);
                if(lch=='a' || lch=='i' || lch=='e' || lch=='o' || lch=='u'){
                    sum--;
               }
               left++;
            }
            if(right-left+1==k){
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}