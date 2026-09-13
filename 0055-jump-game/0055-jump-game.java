class Solution {
    public boolean canJump(int[] nums) {
        int maxjumps = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxjumps) {
                return false;
            }

            maxjumps = Math.max(maxjumps, i + nums[i]);

            if (maxjumps >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}