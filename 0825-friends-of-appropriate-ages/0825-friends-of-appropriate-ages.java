class Solution {
    public int numFriendRequests(int[] age) {

        int[] countAge = new int[121];

        // Count how many people have each age
        for (int a : age) {
            countAge[a]++;
        }

        int count = 0;

        for (int i = 1; i <= 120; i++) {

            if (countAge[i] == 0) {
                continue;
            }

            for (int j = 1; j <= 120; j++) {

                if (countAge[j] == 0) {
                    continue;
                }

                if (j <= 0.5 * i + 7) {
                    continue;
                }

                if (j > i) {
                    continue;
                }

                if (j > 100 && i < 100) {
                    continue;
                }

                count += countAge[i] * countAge[j];

                if (i == j) {
                    count -= countAge[i];
                }
            }
        }

        return count;
    }
}