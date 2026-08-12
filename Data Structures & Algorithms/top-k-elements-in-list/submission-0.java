class Solution {

    private Map<Integer, Integer> buidFrequencyMap(int[] nums) {
        Map <Integer, Integer> frequentMap = new HashMap<>();

        for (int number : nums) {

            frequentMap.put(number, frequentMap.getOrDefault(number, 0) + 1 );
        }

        return frequentMap;
    }

    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> frequentMap = buidFrequencyMap(nums);

        List<Integer>[] bucket = new List[nums.length + 1 ];

        for (Map.Entry<Integer, Integer> entry : frequentMap.entrySet()) {

            int number = entry.getKey();

            int frequent = entry.getValue();

            if (bucket[frequent] == null) {
                bucket[frequent] = new ArrayList<>();
            
            }

            bucket[frequent].add(number);
        }

        int[] result = new int[k];
        int index =0;
        for (int i = bucket.length - 1; i>= 1 && index < k; i--) {
            if (bucket[i] != null) {

                for (int number : bucket[i]) {
                    result[index++] = number;
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
