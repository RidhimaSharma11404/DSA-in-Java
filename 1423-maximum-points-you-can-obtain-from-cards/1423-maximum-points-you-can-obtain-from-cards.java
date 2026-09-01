class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        int ans=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        ans=sum;
        for(int i=1;i<=k;i++){
            sum-=cardPoints[k-i];
            sum+=cardPoints[n-i];
            ans=Math.max(ans,sum);


        }
        return ans;

        
    }
}