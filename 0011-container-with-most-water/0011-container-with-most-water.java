class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        int maxarea=0;
        while(left<right){
            int length=Math.min(height[left],height[right]);
            int breadth=right-left;
            area=length*breadth;
            maxarea=Math.max(maxarea,area);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }

        }
        return maxarea;
        
    }
}