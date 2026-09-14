class Solution {
    public int maxDepth(String s) {
        int n=s.length()-1;
        int count=0;
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')'){
                count++;
                ans=Math.max(ans,count);

            }else if(s.charAt(i)=='('){
                count--;
            }

        }
        return ans;


        
    }
}