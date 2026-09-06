class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        int n=s.length();
        String ans="";
        boolean[][]dp=new boolean[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if((s.charAt(i)==s.charAt(j) && ((j-i<=2) || dp[i+1][j-1]))){
                    dp[i][j]=true;
                    if(j-i+1>ans.length()){
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;


        
    }
}