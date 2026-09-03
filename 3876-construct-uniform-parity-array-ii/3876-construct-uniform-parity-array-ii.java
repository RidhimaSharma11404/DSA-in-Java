class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        int n=nums1.length;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==1){
                min=Math.min(min,nums1[i]);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return true;
        }
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0 && nums1[i]<min){
                return false;

            }
        }
        return true;
        
    }
}