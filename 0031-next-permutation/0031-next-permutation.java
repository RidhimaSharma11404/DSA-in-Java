class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
        
    }
    public void swap(int []nums,int i,int j){
        int n=nums.length;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int []nums,int i,int j){
        int left=i;
        int right=j;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;

        }
    }
}