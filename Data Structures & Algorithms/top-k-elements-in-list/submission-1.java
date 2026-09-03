class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Bước 1: Đếm tần suất mỗi phần tử

        Map<Integer, Integer> frequentMap = new HashMap<>();

        for (int num : nums) {

            frequentMap.put(num, frequentMap.getOrDefault(num, 0) + 1);
        }

        // Bước 2: Lấy danh sách unique elements → sort theo tần suất giảm dần

        List<Integer> uniqueElements = new ArrayList<>(frequentMap.keySet());

        uniqueElements.sort((a,b) -> frequentMap.get(b) - frequentMap.get(a));

        // Bước 3: Lấy k phần tử đầu tiên

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            result[i] = uniqueElements.get(i);
        }

        return result;
    }
}
