class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        int prev2 = 0;
        int prev1 = nums[0]; 

        for (int i = 1; i < length; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}