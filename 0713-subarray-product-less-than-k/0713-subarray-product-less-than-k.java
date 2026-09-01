class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<=1){
            return 0;
        }
        int prod=1;
        int ans=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            prod*=arr[i];
            while(prod>=k){
                prod/=arr[j];
                j++;
            }
            ans+=(i-j+1);

        }
        return ans;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna