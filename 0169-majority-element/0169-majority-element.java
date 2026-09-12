class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int maxcount=0;
        int element=0;
        
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
            }
            if(nums[i]==element){
                count++;
                maxcount=Math.max(maxcount,count);
            }else{
                count--;
            }
        }
        return element;

        
    }
}