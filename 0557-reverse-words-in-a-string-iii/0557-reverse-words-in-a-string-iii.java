class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        String rev = "";
        
        for(int j = 0; j < words.length; j++) {
            
            for(int i = words[j].length() - 1; i >= 0; i--) {
                rev += words[j].charAt(i);
            }
            
            if(j < words.length - 1) {
                rev += " ";
            }
        }
        
        return rev;
    }
}