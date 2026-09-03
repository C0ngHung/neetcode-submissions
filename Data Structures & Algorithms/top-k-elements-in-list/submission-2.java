class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Bước 1: Đếm tần suất mỗi phần tử
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        }

        // Bước 2: Min-Heap — sắp xếp theo tần suất tăng dần  
        // Top của heap luôn là phần tử có tần suất NHỎ NHẤT

        PriorityQueue<Integer> minHeap = new PriorityQueue<>
        ((a,b) -> freqMap.get(a) - freqMap.get(b));

        // Bước 3: Duyệt qua tất cả unique elements

        for (int num : freqMap.keySet()) {

            minHeap.offer(num);

            // Giữ heap size = k → loại phần tử có tần suất nhỏ nhất

            if (minHeap.size() > k ) {

                minHeap.poll();
            }
        }

        // Bước 4: Lấy kết quả từ heap

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            result[i] = minHeap.poll();
        }

            return result;
    }


}
