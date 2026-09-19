class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []freq=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        int max=0;
        for(int f:freq){
            max=Math.max(max,f);
        }
        int count=0;
        for(int f:freq){
            if(f==max){
                count++;
            }

        }
        int ans=(max-1)*(n+1)+count;
        return Math.max(ans,tasks.length);
        
        
    }
}