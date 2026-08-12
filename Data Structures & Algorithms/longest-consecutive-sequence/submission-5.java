class Solution {
    public int longestConsecutive(int[] nums) {
        // Cách 3 dùng Hashet

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) numSet.add(num);

        int maxLength = 0;

        for (int num : numSet) {
            if(!numSet.contains(num-1)) {
                int currentLength = 1;
                int currentNum = num;
            
            while (numSet.contains(currentNum + 1)) {
                currentNum++;
                currentLength++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        
    }
return maxLength;
}
}
