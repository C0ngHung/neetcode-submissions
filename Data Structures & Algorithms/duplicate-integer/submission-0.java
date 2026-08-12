class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int number : nums) {
            if (!seenNumbers.add(number)) {
                return true;
            }
        }

        return false;
    }
}