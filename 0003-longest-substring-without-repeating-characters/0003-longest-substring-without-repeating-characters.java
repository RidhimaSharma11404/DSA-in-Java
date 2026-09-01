class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int []freq=new int[128];
        int left=0;int ans=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)]++;
            while(freq[s.charAt(right)]>1){
                freq[s.charAt(left)]--;
                left++;
            }
            ans=Math.max(ans,right-left+1);

            
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna