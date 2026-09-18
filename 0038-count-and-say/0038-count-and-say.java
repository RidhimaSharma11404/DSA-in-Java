class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for (int row = 2; row <= n; row++) {
            String next = "";
            int count = 1;
            for (int i = 1; i < ans.length(); i++) {
                if (ans.charAt(i) == ans.charAt(i - 1)) {
                    count++;
                } else {
                    next += count;
                    next += ans.charAt(i - 1);
                    count = 1;

                }

            }
            next += count;
            next += ans.charAt(ans.length() - 1);
            ans = next;
        }
        return ans;

    }
}