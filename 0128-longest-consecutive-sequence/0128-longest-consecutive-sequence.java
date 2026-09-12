import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        int longest=0;
        for(int num:nums){
            map.add(num);
        }
        for(int num:map){
            if(!map.contains(num-1)){
                int current=num;
                int streak=1;
                while(map.contains(current+1)){
                    current++;
                    streak++;
                }
                longest=Math.max(longest,streak);
            }
            
        }
        return longest;
        
    }
}