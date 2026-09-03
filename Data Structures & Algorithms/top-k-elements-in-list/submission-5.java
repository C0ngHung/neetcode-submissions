class Solution {
    @SuppressWarnings("unchecked")
public int[] topKFrequent(int[] nums, int k) {
    // Bước 1: Đếm tần suất mỗi phần tử
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : nums) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Bước 2: Tạo bucket — index = tần suất, value = danh sách phần tử
    // Tần suất tối đa = nums.length → cần mảng size nums.length + 1
    List<Integer>[] bucket = new List[nums.length + 1];

    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        int num = entry.getKey();
        int freq = entry.getValue();

        if (bucket[freq] == null) {
            bucket[freq] = new ArrayList<>();
        }
        bucket[freq].add(num);
    }

    // Bước 3: Duyệt ngược bucket — từ tần suất cao nhất → thấp nhất
    int[] result = new int[k];
    int index = 0;

    for (int i = bucket.length - 1; i >= 1 && index < k; i--) {
        if (bucket[i] != null) {
            for (int num : bucket[i]) {
                result[index++] = num;
                if (index == k) {
                    break; // Đã lấy đủ k phần tử
                }
            }
        }
    }

    return result;
}
}
