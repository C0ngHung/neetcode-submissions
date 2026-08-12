class Solution {
    public int longestConsecutive(int[] nums) {
        // Cách 2 thay vì dùng Brute Force duyệt mảng nhiều lần thì ta dùng sorting 

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        // Tạo biến lưu maxLength
        int maxLength = 1;
        // Tạo biến lưu currentLength
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++ ) {
            // Bắt đầu từ i = 1 vì nếu từ i = 0; không thể check phần tử trước nó được
            // Sẽ bắt ra exception ArrayIndexOutOfBoundsException
            // Và ta cũng đã khởi tạo maxLength ban đầu =  1, currentLength = 1;
            // Tính ra cho thằng phần tử đầu tiên rồi;
            if (nums[i] == nums[i-1]) continue; // Check trường hợp trùng nhau thì bỏ qua
            if (nums[i] == nums[i-1] + 1) {
                // Tăng currentLength lên
                currentLength++;
            } else {
                // Ngược lại thì set currentLength về lại 1. Vì đang set phần tử nó không rỗng nên không thể về 0
                currentLength = 1;
            }

            maxLength = Math.max(currentLength, maxLength);
        }

        return maxLength;
    }
}
