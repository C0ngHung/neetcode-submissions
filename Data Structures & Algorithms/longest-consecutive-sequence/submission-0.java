class Solution {
    public int longestConsecutive(int[] nums) {
        
        int maxLength = 0;

        for (int num : nums) {

            int currentNum = num;
            int currentLenght = 1;

            while (arrayContains(nums, currentNum + 1)) {

                currentNum ++;
                currentLenght ++;
            }

            maxLength = Math.max(currentLenght, maxLength);
        }

        return maxLength;
    }

    // Private helper method to check contains
    private boolean arrayContains (int[] nums, int target) {

        for (int num : nums) {
            if (num == target) return true;
        }

        return false;
    }
}
