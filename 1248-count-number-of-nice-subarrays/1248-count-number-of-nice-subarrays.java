class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
        
    }
    public int atmost(int[]nums,int goal){
        if(goal<0){
            return 0;
        }
        int right=0;
        int left=0;
       
        int sum=0;
        int count=0;
        while(right<nums.length){
            sum+=nums[right]%2;
            while(sum>goal){
                sum-=nums[left]%2;
                left++;
            }
            count+=right-left+1;
            right++;
            

        }
        return count;
    }
}