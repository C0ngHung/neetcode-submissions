class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> store = new HashSet<>();

        for (int num : nums) {
            store.add(num);
        }

        int res = 0;

        for (int num : store) {
            // Chỉ đếm nếu 'num' là phần tử đầu tiên của dãy
            if (!store.contains(num - 1)) {
                
                int curr = num;
                int length = 1;

                // Vòng lặp đếm chuỗi phải nằm BÊN TRONG if
                while (store.contains(curr + 1)) {
                    curr++;
                    length++;
                }

                // Cập nhật kết quả cũng phải nằm BÊN TRONG if
                res = Math.max(res, length);
            }
        }

        return res;
    }
}
