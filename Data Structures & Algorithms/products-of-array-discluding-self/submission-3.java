class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;


        // Bước 1: Tính prefix product — tích tất cả phần tử bên TRÁI
        int[] prefix = new int[n];

        prefix[0] = 1;

        for ( int i = 1; i < n; i++ ) {

            prefix[i] = prefix[i - 1] * nums[i - 1];
        }


        // Bước 2: Tính suffix product — tích tất cả phần tử bên PHẢI
        int[] suffix = new int[n];

        suffix[n-1] = 1;

        for ( int i = n - 2; i >= 0; i-- ) {

            suffix[i] = suffix[ i + 1 ] * nums [ i + 1 ];
        }

        // Bước 3: Kết hợp prefix * suffix
        int[] answer = new int[n];

        for ( int i = 0; i < n; i++) {

            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }
}  
