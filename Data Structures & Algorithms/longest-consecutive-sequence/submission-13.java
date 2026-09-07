class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> store = new HashSet<>();

        for (int num : nums) {
            store.add(num);
        }

        int res = 0;

        for (int num : store) {

            if (!store.contains(num - 1)) {
                
                int curr = num;
                int length = 1;

                while (store.contains(curr + 1)) {
                    curr++;
                    length++;
                }

                res = Math.max(res, length);
            }
        }

        return res;
    }
}
