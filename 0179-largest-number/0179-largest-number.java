class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        // Convert int to String
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort according to a + b vs b + a
        Arrays.sort(arr, (a, b) -> {
            return (b + a).compareTo(a + b);
        });

        // If largest number is 0
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

        for (String s : arr) {
            ans.append(s);
        }

        return ans.toString();
    }
}