class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length && k>0;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            sum+=x;
            min = Math.min(min, x);
        }
        if(k%2==1){
            sum=sum-2*min;
        }
        return sum;       
    }
}