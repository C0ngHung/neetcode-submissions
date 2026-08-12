class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<>();

        for (int number : nums) {

            if (!num.add(number)) return true;
        }
        
        return false;
    }
}