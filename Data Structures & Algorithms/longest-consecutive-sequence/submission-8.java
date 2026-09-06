class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

    Arrays.sort(nums);

    int currentStreak = 1;
    int maxStreak = 1;

    for (int i = 1; i < nums.length; i++) {
        // Skip duplicates
        if (nums[i] == nums[i - 1]) continue;

        if (nums[i] == nums[i - 1] + 1) {
            currentStreak++;
        } else {
            currentStreak = 1;
        }

        maxStreak = Math.max(maxStreak, currentStreak);
    }

    return maxStreak;
    }
}
