class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);

            if (Character.isLetterOrDigit(curr)) {

                sb.append(Character.toLowerCase(curr));
            }
        }

        int left = 0;
        int right = sb.length() - 1;
        
        while (left < right) {

            if (sb.charAt(left) != sb.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }


}
