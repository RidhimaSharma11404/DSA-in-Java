class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int []char1=new int[256];
        int []char2=new int[256];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(char1[c1]!=char2[c2]){
                return false;
            }
            char1[c1]=i+1;
            char2[c2]=i+1;

        }
        return true;
    }
}