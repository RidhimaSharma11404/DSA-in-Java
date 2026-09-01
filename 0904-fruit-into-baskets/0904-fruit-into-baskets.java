class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int ans = 0;
        int type = 0;

        int[] freq = new int[100001];

        for (int right = 0; right < fruits.length; right++) {

            // Add right fruit
            if (freq[fruits[right]] == 0) {
                type++;
            }

            freq[fruits[right]]++;

            // Too many types
            while (type > 2) {

                freq[fruits[left]]--;

                if (freq[fruits[left]] == 0) {
                    type--;
                }

                left++;
            }

            // Maximum window
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna